// Escribe tu código aquí.
const cadena="hola"
const array1=["juan","olgassss","ana"]
let array2=[]
function funcion(cadena,array1){
    for(let i=0;i<3;i++){
        if(cadena.length<array1[i].length){
            array2.push(array1[i])
        }
    }
    
    
    return array2
}

console.log(funcion(cadena,array1));

//punto 2 
 function imprimirDOM(array1){
    for(let i=0;i<array1.length;i++){

        document.getElementById("arr").innerHTML+=(`<li>${array1[i]}</li>`)
    }

 }

 imprimirDOM(array1)
