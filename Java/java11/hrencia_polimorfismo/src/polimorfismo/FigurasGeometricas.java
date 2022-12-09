package polimorfismo;

import java.util.Scanner;

public abstract class  FigurasGeometricas {
	protected double base;
	protected double altura;
	protected double area;
	Scanner input;
	public abstract void pedirDatos(); /*{
		input=new Scanner(System.in);
		System.out.print("Intruduzca la base: ");
		base=input.nextDouble();
		System.out.print("Intruduzca la altura: ");
		altura=input.nextDouble();
	}*/
	
	public abstract void area();
	
	public void vsializar() {
		System.out.println("El area es: "+area);
	}
}
