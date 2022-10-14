//propiedades de arreglos
//length

const frutas=["pera","manzana","guayaba","platano"]
console.log(frutas.length)

//metodos de arreglos

//push agrega al final 
frutas.push("platano","sandia")
console.log(frutas.length);
console.log(frutas);

//unshift agrega al inicio
frutas.unshift("melon")
console.log(frutas);

//metodos para quitar
//pop quita un elemento del final del arreglo
let elemento = frutas.pop()
console.log(frutas);
console.log(elemento);

//shift quita un elemento del final de arreglo 

let elemento2 = frutas.shift()
console.log(frutas);
console.log(elemento2);

//indexOf busca un elemento y retorna el indice del primer elemento que cumpla con las caracteristicas, si no se encuentra retorna -1
console.log(frutas.indexOf("manzana"));
console.log(frutas.indexOf("platano"));

//reverse invierte el orden del arreglo
frutas.reverse()
console.log(frutas);

//sort
//ordena alfabetico
frutas.sort()
console.log(frutas);
//ordena tomando en cuenta el primer digito
const num = [4,453,45,68,89,786,1]
console.log(num.sort());
//numeros.sort((a,b) => a -b) funcion para ordenar los numeros de manera correcta
num.sort(function orden(a,b)  {return a -b})// funcion callback forma largaa 

console.log(num);

