//constructor de forma literal solo JS
let constructor= function () {
    let valor0=5;
    let valor1=6;

    //declarando un objeto
    let persona={
        nombre:"Pedro",
        apellido:"Lara",
        suma:function(valor0,valor1){
            return valor0+valor1
        },
        get nombre1(){
            return this.nombre
        },
        set nombre1(nombre2){
            this.nombre=nombre2
        }
    };

    return persona
}
/* let persona1= new constructor()
console.log(persona1.apellido); */
let persona1=constructor()
// se utiliozaron metos get y set en este caso get para cambiar el atributo nombre
persona1.nombre="Carlos"
console.log(persona1.nombre);