package operadores;

import java.util.Scanner;

public class Ciclos {
	
	 void saludo() {
		System.out.println("hola a las funciones en java");
	}
	int operacion() {
		int f= (int)Math.pow(3, 2);
		return  f;
	}
	
	
	static float nuevo() {
		return 0.0f;
	}
	String caracteres() {
		String nombre="Hola buen dia";
		return nombre;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int tabla=2;
		for(int i=0;i<=10;i++) {
			System.out.println(tabla+"*"+i+"="+tabla*i);
		}*/
		
		nuevo();
		Ciclos objC= new Ciclos();
		objC.saludo();
		System.out.println("uso de pow"+objC.operacion());

		objC.operacion();	
		System.out.println(objC.caracteres());
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingresa el valor de la tabla de multiplicar  con el ciclo for");
		int tabla=scanner.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(tabla+"*"+i+"="+tabla*i);
		}
		System.out.println("Ingresa el valor de la tabla de multiplicar con el ciclo While ");
		int j=0;
		int tablaW=scanner.nextInt();
		while(j<=10) {
			System.out.println(tablaW+"*"+j+"="+tablaW*j);
			j++;
		}
		


	}

}
