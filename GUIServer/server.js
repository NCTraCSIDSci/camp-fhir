var http = require('http');  
var fs = require('fs');

const express = require('express')
const app = express()

//read the server values and write the files to a file
app.use(
    express.urlencoded({
      extended: true
    })
  )
  
  app.use(express.json())
  
  app.post('/8000', (req, res) => {
    console.log(req.body)
    fs.writeFile('text.txt', req.body, err => {
        if (err) {
         console.error(err)
         return
        } 
    })
  })

function onRequest (request, response) {
    response.writeHead(200, {  
        'Content-Type': 'text/html'  
    });  
    fs.readFile('./GUIServer/server.html', null, function(error, data){
        console.log("this server is running");
        if(error) {
            response.writeHead(404);
            response.write('File got lost');
        } else {
            //write the HTML file or render it
            response.write(data);
            
        }
        response.end();
    })
}
http.createServer(onRequest).listen(8000);


