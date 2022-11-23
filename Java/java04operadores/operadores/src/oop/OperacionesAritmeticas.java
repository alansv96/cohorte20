package oop;

import java.util.Scanner;

public class OperacionesAritmeticas {
	Scanner scanner = new Scanner(System.in);
	
	float suma() {
		System.out.println("ingrese numero 1 a sumar");
		float num1=scanner.nextFloat();
		System.out.println("ingrese numero 1 a sumar");
		float num2=scanner.nextFloat();
		
		return num1+num2;
	}
	
	float resta() {
		System.out.println("ingrese numero 1");
		float num1=scanner.nextFloat();
		System.out.println("ingrese numero 2 a restar");
		float num2=scanner.nextFloat();
		
		return num1-num2;
	}
	float mult() {
		System.out.println("ingrese numero 1 a multiplicar");
		float num1=scanner.nextFloat();
		System.out.println("ingrese numero 2 a a multiplicar");
		float num2=scanner.nextFloat();
		
		return num1*num2;
	}
	
	float div() {
		System.out.println("ingrese dividendo ");
		float num1=scanner.nextFloat();
		System.out.println("ingrese numero divisor");
		float num2=scanner.nextFloat();
		if(num2==0) {
			System.out.println("no se puede divir entre 0");
		}
		else {
			return num1/num2;

		}
		return 0;
		
	}
	float modulo() {
		System.out.println("ingrese numero 1 a dividor");
		float num1=scanner.nextFloat();
		System.out.println("ingrese numero 2  divisor");
		float num2=scanner.nextFloat();
		
		return num1%num2;
	}
	
	
	
	
	
	

}
