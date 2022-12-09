package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas {

	Scanner s=new Scanner(System.in);

	
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=base*base;
		
	}
	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Cuadrado");
		System.out.print("Introduzca un lado: ");
		base=s.nextDouble();
		
		
	}

	
	
}
