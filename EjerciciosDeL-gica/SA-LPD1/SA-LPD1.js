
let num1= Number (prompt("ingrese el numero 1"))
let num2= Number (prompt("ingrese el numero 2"))
let num3= Number (prompt("ingrese el numero 3"))
if(num1>=num2 && num1>=num3)
{
    if(num2>num3){
        console.log(num1,num2,num3);
        console.log(num3,num2,num1);
    }
    
    else{
        console.log(num1,num3,num2);
        console.log(num2,num3,num1);
    }
    
}

if(num2>num1 && num2>num3)
{
    if(num1>num3){
        console.log(num2,num1,num3);
        console.log(num3,num1,num2);
    }
    
    else{
        console.log(num2,num3,num1);
        console.log(num1,num3,num2);
    }
}

if(num3>=num2 && num3>num1)
{
    if(num2>num1){
        console.log(num3,num2,num1);
        console.log(num1,num2,num3);
    }
   
    else{
        console.log(num3,num1,num2);
        console.log(num2,num1,num3);
    }
  
}