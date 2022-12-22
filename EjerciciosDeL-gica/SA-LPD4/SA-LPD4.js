
const numero = Number(prompt('Ingrese un numero: '));
let n1 = 0
let n2 = 1
let next

console.log('Fibonacci:');
console.log(n1);
console.log(n2); 

nextTerm = n1 + n2;

while (next <= numero) {

    
    console.log(next);

    n1 = n2;
    n2 = next;
    next = n1 + n2;
}