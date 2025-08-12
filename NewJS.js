function hello(callback){
    console.log("Hello Git");
    return callback();
}

function whatsUp(){
    console.log("What's up JS?");
}

hello(whatsUp);