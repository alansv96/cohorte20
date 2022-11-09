//forma 1 

//1 llamar al contenedor

const imagen= document.getElementsByClassName("contenedor")[0]

//2 crear el elemento

const nuevaImg= document.createElement("img")

//3 modificar atributos
nuevaImg.src="https://placeimg.com/200/200/nature"
nuevaImg.alt="Imagen de naturaleza"

//4 insertar el elemto 
imagen.appendChild(nuevaImg)

/* otra manera de crear elementos */

//1 llamar a elemento contenedor 
const imagen2 = document.getElementById("img")
//2
imagen2.innerHTML=`
    <img src="https://placeimg.com/200/200/animals" alt="Imagen de animales" />
`
/* crear una lista a partir der los elementos guardados en un arreglo 
insertar en el documento para que se pueda mostrar*/

const nombres= ["pedro","juan,Sonia","miguel"]

const strucLista= document.getElementById("lista")


 nombres.forEach((el) =>{
    const li =document.createElement("li")
    li.textContent=el
    strucLista.appendChild(li)
}) 

//forma 2

const frutas=["manzana","limon","pera","uva"]
const lista1=document.getElementById("lista1")
frutas.forEach((elemento)=>{
    lista1.innerHTML+=`<li>${elemento}</li>`
})
/* otra forma 
 for(let i=0;i<nombres.length;i++){
    strucLista.innerHTML+=`<li>${nombres[i]}</li>`
 } */
