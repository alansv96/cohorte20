function factorial(n){
    if(n==0){
        return 1;
    }
    return n * factorial(n-1)
}

let numero=Number(prompt("ingrese numero a sacar factorial"))
console.log(factorial(numero));
/* 
let total=1
for(i=1;i<=5;i++){
    total=total*i
}
console.log(total); */