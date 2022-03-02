const express = require('express');
var bodyParser = require('body-parser')
const app = express();
var fs = require('fs');
const { exec } = require("child_process");

var urlencodedParser = bodyParser.urlencoded({ extended: false })

app.get('/', (req, res) => {
  res.sendFile(__dirname + '/server.html');
});
app.use(bodyParser({limit: '500mb'}));

app.post('/', urlencodedParser, (req, res) => {
    if(req.body.custommapping != "on")
    {
       req.body.resourceconfiguration = "";
       req.body.custommapping = "false";
    }
   
    fs.writeFile('config.json', JSON.stringify(req.body), err => {
        if (err) {
         console.error(err)
         return
        }
        else{

        }
        })

        exec("java -jar CAMPFHIR.jar", (error, stdout, stderr) => {
            res.send('<p>Process Complete!</p>');            
            if (error) {
                console.log(`error: ${error.message}`);
                return;
            }
            if (stderr) {
                console.log(`stderr: ${stderr}`);
                return;
            }

            console.log(`stdout: ${stdout}`);
         });

});

app.listen(3000);
