var http = require('http');  
var fs = require('fs');
function onRequest (request, response) {
    response.writeHead(200, {  
        'Content-Type': 'text/html'  
    });  
    fs.readFile('server.html', null, function(error, data){
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