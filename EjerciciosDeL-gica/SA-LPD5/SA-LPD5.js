let numSec=Number(prompt("ingrese numero secreto del 1 al 100"))
let secreto=46
let array=[numSec]
while(secreto!=numSec){
    console.log("ups el numero secreto es incorrecto, vuelva a intentarlo");
    numSec=Number(prompt("ingrese numero secreto del 1 al 100"))
    array.push(numSec)
}
console.log("felicidades encontraste el numero secreto");
console.log(array);