const express = require('express');
var bodyParser = require('body-parser')
const app = express();
var fs = require('fs');

var urlencodedParser = bodyParser.urlencoded({ extended: false })

app.get('/', (req, res) => {
  res.sendFile(__dirname + '/server.html');
});

app.post('/', urlencodedParser, (req, res) => {
    res.sendStatus(200);
   
    fs.writeFile('config.json', JSON.stringify(req.body), err => {
        if (err) {
         console.error(err)
         return
        }
    })
});

app.listen(3000);
