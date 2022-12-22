package ejercicio6;

import java.util.Scanner;

public class InvertirCadena {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		String cadena = scanner.nextLine();
		
		String invertida = "";
		
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena invertida: " + invertida);

	}

}
