

/*function saludoPer(miVariable){
    let miVariable = prompt("Cual tu nombre: ")
    alert(miVariable)
}*/
function suma(){
    //let num1=parseInt(prompt("de el valor del numero 1: ")) 
    //let num2=parseInt(prompt("de el valor del numero 1: "))
    let num1= 3
    let num2= 5
    return num1+num2
}
function resta(){
    let num1=6
    let num2=4

    return num1-num2

}

function mult(){
    let num1=7
    let num2=9

    return num1*num2
}

function div(){
    let num1 = 25
    let num2 = 0

    if(num2 == 0){
        console.log("el denominador no debe de ser cero");
    }

    else {
        return num1/num2
    }

    
}
function residuo(){
    let num1= 25
    let num2= 4

    return num1%num2
}

function adicionales(){
    let num1=5

    return num1+=1
}

function logico(){
    let valido= 5
    let valido2=5
    if(valido >= valido2){

        console.log("el mayor es: ",valido2);
    }
    //console.log("el valor booleano es: ",valido)
}

function edad(){
    let miEdad = 1
    if(miEdad>=18){
        console.log("Es mayor de edad")
    }
    else
    {
        console.log("Es menor de edad")
    }
}

function conjuncion(){
    let valor1 = false
    let valor2 = true
    if(valor1 && valor2){

        console.log("el valor 1 y 2 son verdaderos")
    }
    else{
        console.log("un valor es falso")
    }
}

function disyuncion(){
    let valor1 = false
    let valor2 = true
    if(valor1 || valor2){

        console.log("el valor 1 o 2 son verdaderos")
    }
    else{
        console.log("ambos valores son falsos")
    }
}
function negacion(){
    let valor1=true
    if(!(!valor1)){
        console.log("El valor es ",valor1)
    }
    else{
        console.log("el negado valor es ",valor1)
    }
}
//alert(suma())
/*console.log("el resultado de la suma es:" ,suma())
console.log("el resultado de la resta es:", resta())
console.log("el resultado de la multiplicacion es: ",mult())
console.log("el resultado de la division es  es: ",div())
console.log("el resultado del residuo   es: ",residuo())
console.log("el resultado del incremento es: ",adicionales());
//saludoPer(miVariable)*/
//logico()
edad()
conjuncion()
disyuncion()
negacion()