// switch case 
//switch evalua opciones
/* let dia = 1;

switch(dia){
    case 1:
        document.write("Lunes");
        break;
    case 2:
        document.write("Martes");
        break;
    case 3:
        document.write("Miercoles");
            break;
    case 4:
        document.write("Jueves");
        break;
    case 5:
        document.write("Viernes");
        break;
    case 6:
        document.write("Sabado");
        break;
    case 7:
        document.write("Domingo");
        break;
    default:
        document.write("No es un dia valido");
        break;
} */


//operador ternario
//if simplificado
/* condicion ? en caso de ser verdad: en caso de ser falso */

let edad = 18;

let mensaje = edad >= 18 
    ? "es mayor de edad"
    : "tas chiquito";

console.log(mensaje);

console.log(`Yo soy Alan y soy ${edad >= 18 ? "soy mayor de edad":"soy nemor de edad"}`);