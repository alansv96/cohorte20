
let precio = Number(prompt("ingresa el precio"))
let cupon = prompt("ingresa el cupon")

switch(cupon){
    case "bronce":
        let precioDescuento5= (precio-(precio*.05))
        document.write("Precio original: " + precio);
        document.write(" Precio con descuento: " + precioDescuento5);
        break;
        case "plata":
            let precioDescuento10= (precio-(precio*.1))
            document.write("Precio original: " + precio);
            document.write(" Precio con descuento: " + precioDescuento10);
            break;
        case "oro":
            let precioDescuento20= (precio-(precio*.2))
            document.write("Precio original: " + precio);
            document.write(" Precio con descuento: " + precioDescuento20);
            break;
        case "platino":
                let precioDescuento25= (precio-(precio*.25))
                document.write("Precio original: " + precio);
                document.write(" Precio con descuento: " + precioDescuento25);
                break;
        default:
            document.write("Ingrese un cupon valido ");
            break;

}