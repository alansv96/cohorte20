const titulo=document.getElementById("titulo")
const parrafos= document.getElementsByClassName("parrafo")
titulo.textContent="hola"
parrafos[0].innerHTML="soy un pavo"
console.log(titulo.innerHTML);
console.log(parrafos[1].textContent);

/* parrafos[1].style.color="red"
parrafos[1].style.backgroundColor="blue" */
/* console.log(parrafos[1].classList.contains("coloresFeos")); */
const padre= document.getElementById("padre")
parrafos[1].classList.add("coloresFeos")

// Crear elementos html
const enlace=document.createElement("a")
enlace.href="https://www.google.com"
enlace.textContent="Ir a google"

/* document.body.appendChild(enlace) */
/* document.body.insertAdjacentElement("beforeend",enlace) */

padre.append(enlace)

console.log(document.body);

