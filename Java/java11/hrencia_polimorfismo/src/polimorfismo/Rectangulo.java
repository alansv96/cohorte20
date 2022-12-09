package polimorfismo;

import java.util.Scanner;

public class Rectangulo  extends FigurasGeometricas{
	Scanner s =new Scanner(System.in);
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Rectangulo");
		System.out.print("Introduzca la base: ");
		base=s.nextDouble();
		System.out.println("untroduzca la altura");
		altura=s.nextDouble();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=base*altura;
	}

}
