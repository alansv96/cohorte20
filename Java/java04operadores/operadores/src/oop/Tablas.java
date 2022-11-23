package oop;
import java.util.Scanner;

public class Tablas {
	
	Scanner scanner = new Scanner(System.in);
	void tabla() {
		System.out.println("introdusca el numero de la tabla ");
		int nTabla= scanner.nextInt();
		int i=1;
		while(i<=10) {
			
			System.out.println(nTabla+"*"+i+"="+(nTabla*i));
			i++;
			
		}
	}
	
	

	
}
