package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para ingresar datos
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("Ingresa un dato: ");
		String dato=scanner.nextLine();
		System.out.println("El dato que ingresaste es: "+dato);*/
		
		//operadores 
		/*int valor0=6;
		int valor1=4;
		int suma=valor0+valor1;
		System.out.println("suma: "+suma);
		int resta=valor0-valor1;
		System.out.println("resta: "+resta);
		int mult=valor0*valor1;
		System.out.println("multiplicacion: "+mult);
		int div=valor0/valor1;
		System.out.println("division: "+div);
		int modulo=valor0%valor1;
		System.out.println("modulo: "+modulo);*/
		
		//pediorle valores para realizar operaciones
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("Ingresa el valor 1: ");
		int num1=scanner.nextInt();
		System.out.println("Ingresa el valor 2: ");
		int num2=scanner.nextInt();
		
		int suma= num1+num2;
		System.out.println("la suma es:"+suma);
		int res= num1-num2;
		System.out.println("la resta es:"+res);
		int mult= num1*num2;
		System.out.println("la multiplicacion es:"+mult);
		int div= num1/num2;
		if(num2>0) {
			System.out.println("la division es:"+div);

		}
		else {
			System.out.println("el divisor es cero");
		}
			
		int modulo= num1%num2;
		System.out.println("el modulo es:"+modulo);
		if(modulo==0) {
			
			System.out.println("el resultado  es par");
			
		}
		else {
			System.out.println("el resultado es impar");

		}*/
		
		/*int a=3;
		int b=5;
		boolean comparar =a<b;
		boolean logica = true;
		//System.out.println("comparar: "+comparar);
		if(comparar && logica) {
			System.out.println("La operacion logica es verdadera");
		}
		else {
			System.out.println("la operacion logica es falsa");
		}*/
		//switch
		/* int numero=0;
		 String msj=" ";
		 switch(numero) {
		 case 1:
			 System.out.println("caso 1");
			 break;
		 case 2:
			 System.out.println("caso 2");
			 break;
		 case 3:
			 System.out.println("caso 3");
		 default:
			 break;

		 }*/
		int opciones;
		do {
		System.out.println("------ingrese una opcion del menu-------"
				+ "\n 1 Suma"
				+ "\n 2 Resta"
				+ "\n 3 multiplicacion"
				+ "\n 4 division"
				+ "\n 5 modulo"
				+ "\n 6 booleanos"
				+ "\n 7 salir");
		Scanner scanner= new Scanner(System.in);

		opciones=scanner.nextInt();
		switch(opciones) {
		case 1:
			System.out.println("Ingresa el valor 1: ");
			int num1=scanner.nextInt();
			System.out.println("Ingresa el valor 2: ");
			int num2=scanner.nextInt();
			int suma= num1+num2;
			System.out.println("la suma es:"+suma);
			break;
		case 2:
			System.out.println("Ingresa el valor 1: ");
			 num1=scanner.nextInt();
			System.out.println("Ingresa el valor 2: ");
			 num2=scanner.nextInt();
			int resta= num1-num2;
			System.out.println("la resta es:"+resta);
			break;
		case 3:
			System.out.println("Ingresa el valor 1: ");
			 num1=scanner.nextInt();
			System.out.println("Ingresa el valor 2: ");
			 num2=scanner.nextInt();
			 int mult= num1*num2;
			System.out.println("la multiplicacion es:"+mult);
			break;
		case 4:
			System.out.println("Ingresa el valor 1: ");
			 num1=scanner.nextInt();
			System.out.println("Ingresa el valor 2: ");
			 num2=scanner.nextInt();
			 int div= num1/num2;
				if(num2>0) {
					System.out.println("la division es:"+div);

				}
				else {
					System.out.println("el divisor es cero");
				}
				break;
		case 5:
			System.out.println("Ingresa el valor 1: ");
			 num1=scanner.nextInt();
			System.out.println("Ingresa el valor 2: ");
			 num2=scanner.nextInt();
			 int modulo= num1%num2;
				System.out.println("el modulo es:"+modulo);
				if(modulo==0) {
					
					System.out.println("el resultado  es par");
					
				}
				else {
					System.out.println("el resultado es impar");

				}
				break;
		case 6: 
		int a=3;
		int b=5;
		boolean comparar =a<b;
		boolean logica = true;
		//System.out.println("comparar: "+comparar);
		if(comparar && logica) {
			System.out.println("La operacion logica es verdadera");
		}
		else {
			System.out.println("la operacion logica es falsa");
		}
		case 7:
			System.out.println("adios");
			opciones=7;
			break;

			


		}	
		
		}while(opciones != 7);
		
		
		

		

	}

}
