

const numeros= [2,4,6,57,200]
let suma=0
/* forEach
recorre todo el arreglo y ejecuta el codigo que le indiquemos sobre los valores guardados */
/* numeros.forEach(function sumar(elemento){
    suma+=elemento
    return suma


});

console.log(suma); */

numeros.forEach((el,indice) =>{
    console.log(el*el);
})

console.log(numeros);

/* map 
Genera una copia del arreglo original */
let nuevoArr = numeros.map((el) => {
    return el*el
})

console.log(nuevoArr);

/* filter
crea una copia del arreglo original y nos permite filtrar */

const frutas =["papaya","manzana","manzana","uva"];

let frutaFiltrada= frutas.filter((fruta) => fruta.length <=3) ;
console.log(frutaFiltrada);