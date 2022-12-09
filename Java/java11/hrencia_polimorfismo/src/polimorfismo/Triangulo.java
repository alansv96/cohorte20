package polimorfismo;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas{
	
	Scanner s=new Scanner(System.in);
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area= (base*altura)/2;
	}
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Triangulo");
		System.out.print("Introduzca la base: ");
		base=s.nextDouble();
		System.out.println("introduzca la altura");
		altura=s.nextDouble();
		
	}
	
}
