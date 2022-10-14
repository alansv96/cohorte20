

let num1=parseInt(prompt("Ingrese valor del numero 1: ")) 
let num2=parseInt(prompt("Ingrese valor del numero 2: ")) 
let num3=parseInt(prompt("Ingrese valor del numero 3: ")) 

if(num1 == num2 && num2==num3)
{
    console.log("todos los numeros son iguales");
}
else{
if(num1>=num2 && num2>=num3){

    console.log(num1,num2,num3);
    console.log(num3,num2,num1);

}
if(num1>=num3 && num3>=num2){
    console.log(num1,num3,num2);
    console.log(num2,num3,num1);
}

if(num2>num1 && num1>=num3){

    console.log(num2,num1,num3);
    console.log(num3,num1,num2);

}
if(num2>=num3 && num3>=num1){

    console.log(num2,num3,num1);
    console.log(num1,num3,num2);

}
if(num3>num2 && num2>=num1)
{
    console.log(num3,num2,num1);
    console.log(num1,num2,num3);
}
}