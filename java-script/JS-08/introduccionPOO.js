//forma de creacion de objetos literal (sin uso de clases) solo JS
let persona ={
    nombre:"juan",
    apellido:"Perez",
    nombreCompleto: function(){
        return "El nombre completo es "+this.nombre+" "+this.apellido
    }
    

}

for (nombrePropiedad in persona) {
    
    console.log(nombrePropiedad);
    console.log("valor: "+ persona[nombrePropiedad]);
}

persona.tel="332548444"
/* console.log(persona.nombreCompleto());
console.log(persona["apellido"]); */
//creacion objeto sin definir 
/* let persona1=new Object()
persona1.edad=24 */
/* console.log(persona);
console.log(persona.tel); */
//borrar atributo
/* delete persona.tel
console.log(persona); */
let personaArreglo=Object.values(persona)
console.log(personaArreglo);
let personaString=JSON.stringify(persona)
console.log(personaString);