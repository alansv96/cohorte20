package oop;

import java.util.Scanner;

public class Menu {
	
	Scanner scanner = new Scanner(System.in);

	int menuOp() {
		
		
		
		System.out.println("------ingrese una opcion del menu-------"
				+ "\n 1 Multiplicacion"
				+ "\n 2 Operaciones aritmeticas"
				+ "\n 3 multiplicacion"
				+ "\n 4 division"
				+ "\n 5 modulo"
				+ "\n 6 booleanos"
				+ "\n 7 salir");
		return scanner.nextInt();
	}
		
	int subMenu() {
		
		System.out.println("------Menu de operaciones arimeticas-------"
				+ "\n 1 Suma"
				+ "\n 2 Resta  "
				+ "\n 3 multiplicacion"
				+ "\n 4 division"
				+ "\n 5 modulo"
				+ "\n 6 Boolean"
				+ "\n 7 Salir "
				);
		return scanner.nextInt();
	}
	
	

		
		
	
}
