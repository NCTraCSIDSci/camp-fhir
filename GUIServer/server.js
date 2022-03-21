const express = require('express')
const app = express()
var fs = require('fs')
const fsprom = require('fs').promises

const { exec } = require('child_process')
const { xsltProcess, xmlParse } = require('xslt-processor')

// var urlencodedParser = bodyParser.urlencoded({ extended: false })
app.use(express.json())
app.use(express.urlencoded({ extended: true }))

app.get('/', async (req, res) => {
  const xmlfolder = await fsprom.readdir(__dirname + '//XML')
  const xsldata = await fsprom
    .readFile('hibernate.xsl', 'utf8')
    .catch((err) => console.error('Failed to read file', err))
  const tabdata = await fsprom
    .readFile('hibernatetabs.xsl', 'utf8')
    .catch((err) => console.error('Failed to read file', err))
  let outXmlString = ''
  let outTabString = ''
  for (let i = 0; i < xmlfolder.length; i++) {
    const element = xmlfolder[i]
    const xmldata = await fsprom
      .readFile(__dirname + '/XML/' + element, 'utf8')
      .catch((err) => console.error('Failed to read file', err))
    outTabString =
      outTabString + xsltProcess(xmlParse(xmldata), xmlParse(tabdata))
    outXmlString =
      outXmlString + xsltProcess(xmlParse(xmldata), xmlParse(xsldata))
  }

  var htmldata = await fsprom
    .readFile(__dirname + '/server.html', 'utf8')
    .catch((err) => console.error('Failed to read file', err))
  htmldata = htmldata.replace('REPLACE WITH TABXML', outTabString)
  htmldata = htmldata.replace(
    'REPLACE WITH DATABASEXML',
    outXmlString.replace('class="tab-pane"', 'class="tab-pane active"')
  )
  res.send(htmldata)
})
// app.use(bodyParser({ limit: '500mb' }))

app.post('/', (req, res) => {
  if (req.body.custommapping != 'on') {
    req.body.resourceconfiguration = ''
    req.body.custommapping = 'false'
  }

  fs.writeFile('config.json', JSON.stringify(req.body), (err) => {
    if (err) {
      console.error(err)
      return
    } else {
    }
  })

  exec('java -jar CAMPFHIR.jar', (error, stdout, stderr) => {
    res.send('<p>Process Complete!</p>')
    if (error) {
      console.log(`error: ${error.message}`)
      return
    }
    if (stderr) {
      console.log(`stderr: ${stderr}`)
      return
    }

    console.log(`stdout: ${stdout}`)
  })
})
app.post('/saveXML', async function (req, res) {
  const xmlfolder = await fsprom.readdir(__dirname + '//XML')
  for (let i = 0; i < xmlfolder.length; i++) {
    const element = xmlfolder[i]
    let xmldata = await fsprom
      .readFile(__dirname + '/XML/' + element, 'utf8')
      .catch((err) => console.error('Failed to read file', err))
    let changedXMLJSON = req.body
    for (const key in changedXMLJSON) {
      let element = changedXMLJSON[key]

      // console.log(key, ': ', element)
      if (key.includes('tableName')) {
        xmldata = xmldata.replace(
          'table="' + key.replace('tableNameToChangeTo', '') + '">',
          'table="' + element + '">'
        )
      } else {
        xmldata = xmldata.replace(key.trim(), element)
      }
    }
    await fsprom.writeFile(__dirname + '/XML/' + element, xmldata)
  }

  res.send('success')
})
app.listen(3000)
