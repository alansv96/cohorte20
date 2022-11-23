import { indexTest } from "../calculadora";

/*Estructura para ECMA 5 
const  indexTest = require("../calculadora") */
test ("test suma",() =>{
    const r=indexTest.suma(1,2)
    expect(r).toBe(3)
    
});
/* test.toDo("test de resta");
test.toDo("test de mult");
test.toDo("test de div"); */


