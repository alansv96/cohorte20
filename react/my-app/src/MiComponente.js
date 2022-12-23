import React from "react"

const Micomponente = ()=>{
    let nombre="pedroVar"
  let   web ="generation.org"
  let usuario={
    nombre: "JuanHer",
    apellido: "Robles"
  }
    return(
<>
    <header>
        <h1>Componente creado</h1>
        <p>Este es mi primer componente</p>
        <ul>
            <li>nombre:<strong>{nombre}</strong></li>
            <li>web: {web}</li>
            <li>nombre:{usuario.nombre}</li>
            <li>usuario: {JSON.stringify(usuario)}</li>
        </ul>
    
    </header>
</>)

}
export default Micomponente;