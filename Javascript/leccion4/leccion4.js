var nombre = "nahuel";
console.log(nombre);
var nombre = 7;

var numero = 3000;
console.log(typeof numero);

var objeto = {
nombre : "nahuel",
apellido:  "francia",
telefono: "3442606679"

}
console.log( objeto);

function miFuncion(){

    console.log(typeof miFuncion);
}

var simbol = Symbol("mi simbol")
console.log(typeof simbol);

class Persona {
constructor(nombre,apellido){
this.nombre = nombre;
this.apellido = apellido;
}
    
}

console.log(typeof Persona);