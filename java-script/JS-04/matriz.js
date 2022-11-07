let arrayA =[
    [2,5,6],
    [5,9,7],
    [6,4,3]
]

let arrayB=[
    [5,3,2],
    [8,5,4],
    [1,4,9]
]
let arrayC=[
    [,,],
    [,,],
    [,,]
]

for(let i=0;i<arrayA.length;i++){
    
    for(let j=0;j<3;j++){
        arrayC[i][j]=(arrayA[i][j])*(arrayB[j][i])
        
        
    }

}
/* console.table(arrayA);
console.table(arrayB); */
console.table(arrayC);
/* let i=0
do{

     //console.log(array[i]);
   for(let j=0;j<3;j++){
    console.log(array[i][j]);

    }
    i++
console.log("-----------------");
}while(i<array.length)
   


let contador =0 */

/* while (contador <10) {
    console.log(contador);
    contador ++
    
} */

/* do{
    console.log(contador);
    contador ++

}while(contador<=10) */