



/* const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"), 500);
const baz = () => console.log("Third");

bar();
foo();
baz(); */


/* simulacion de servidor */
const nombre =() =>{
    const nombres=["Pepe","Pancho","Maria"]
    /* setTimeout(()=>{
        return nombres
    },1) */
    return new Promise((resolve,reject)=>{//resolve--proceso exitoso 
        setTimeout(()=>{            //reject--proceso no exitoso
            if(false){
                resolve(nombres)
            }
            else{
                reject("no hay nombres")
            }
        },3000)
    })
}

//promesas en cadena 
//nombre().then(nombres=> console.log(nombres)).catch(error=> console.log(error))
//console.log(nombre());

/* termina sumulacion del servidor */

/* console.log(nombre()); */

/* const url="https://pokeapi.co/api/v2/pokemon/25/"

const pokedex=()=>{
    fetch(url)
    .then((datos)=> datos.json())
    .then((pokemon)=>console.log(pokemon))
    .catch(error => console.log(error))
}

pokedex(); */
// () => {return} para mas de un parametro
const cartaPokemon=document.getElementById("pokemon")
const nombrePokemon =document.getElementById("nombrePokemon")
const imagen =document.getElementById("img")
const form=document.getElementById("form")

const pokedex=async (numero)=>{
    const url=`https://pokeapi.co/api/v2/pokemon/${numero}/`
    try {
            const respuesta= await fetch(url)
            const pokemon =await respuesta.json()
            console.log(pokemon.name);
            const datos={
                nombre:pokemon.name,
                imagen: pokemon.sprites.other["official-artwork"].front_default,   
            }
            

            nombrePokemon.textContent=datos.nombre
            imagen.innerHTML=`<img src="${datos.imagen}" alt="" />`
    } catch (error) {
        
    }
}
form.addEventListener("submit",(evento)=>{
    //codigo
    evento.preventDefault()
    

    const valor=document.getElementById("idP").value;
    console.log(valor);
    pokedex(valor)
    //console.log(evento.target);
    form.reset()

})
/* azucar sintactica
codigo que se creo para facilitar rl trabajo de los programadores */

//asyc await 
// async function
const obtenerNombre= async ()=>{
    
    try{
        let nombres= await nombre()
    console.log(nombres);
    } catch(error){
        console.log(error);

    }
    
    
}
/* obtenerNombre(); */