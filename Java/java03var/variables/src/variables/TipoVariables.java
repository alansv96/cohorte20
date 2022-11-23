package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos primitivos enteros
		//byte, short,int, long, char
		//byte usa 256 con signo -127 a 128
		byte numeroB=127;
		System.out.println("tamaño de un byte: "+Byte.SIZE);
		System.out.println("valor maximo de byte: "+Byte.MAX_VALUE);
		System.out.println("valor minimo de byte: "+Byte.MIN_VALUE);
		System.out.println("El valor del byte es: "+numeroB);

		System.out.println("---------------------------------------");
		int entero=545454545;
		System.out.println("tamaño de un int en bytes: "+Integer.BYTES);
		System.out.println("tamaño de un int en bits: "+Integer.SIZE);
		System.out.println("valor maximo de int: "+Integer.MAX_VALUE);
		System.out.println("valor minimo de int: "+Integer.MIN_VALUE);
		System.out.println("El valor del entero es: "+entero);
		System.out.println("---------------------------------------");
		short variableS=6;
		System.out.println("tamaño de un short en bytes: "+Short.BYTES);
		System.out.println("tamaño de un short en bits: "+Short.SIZE);
		System.out.println("valor maximo de short: "+Short.MAX_VALUE);
		System.out.println("valor minimo de short: "+Short.MIN_VALUE);
		System.out.println("---------------------------------------");
		long variableL=545;
		System.out.println("tamaño de un long en bytes: "+Long.BYTES);
		System.out.println("tamaño de un long en bits: "+Long.SIZE);
		System.out.println("valor maximo de long: "+Long.MAX_VALUE);
		System.out.println("valor minimo de long: "+Long.MIN_VALUE);
		System.out.println("---------------------------------------");

		var num =14874623162l;
		System.out.println("esta es la variable con var "+ num);
		// Prefijos para sistemas numericos
		//binario=0b, octal=0, hexadecimal=0x
		var sistemNum=0b1010; 
		System.out.println("decimal: "+sistemNum);
		
		//vareiables primitivads de punto flotante: float, double
		System.out.println("-----Variables de tipo flotante--------");
		
		System.out.println("tamaño de un long en Float: "+Float.BYTES);
		System.out.println("tamaño de un long en Float: "+Float.SIZE);
		System.out.println("valor maximo de Float: "+Float.MAX_VALUE);
		System.out.println("valor minimo de Float: "+Float.MIN_VALUE);
		System.out.println("---------------------------------------");
		float coma=153.10f;

		
		System.out.println("tamaño de un long en Double: "+Double.BYTES);
		System.out.println("tamaño de un long en Double: "+Double.SIZE);
		System.out.println("valor maximo de Double: "+Double.MAX_VALUE);
		System.out.println("valor minimo de Double: "+Double.MIN_VALUE);
		System.out.println("---------------------------------------");
		double comaD=1000.10e10;
		
		System.out.println("El valor del Float es: "+coma);
		System.out.println("El valor del double es: "+comaD);
		
		System.out.println("-----Booleanos--------");
		boolean estado= false;
		System.out.println("--->"+estado);
		
		if(estado) {
			System.out.println("Soy verdadero ");
		}
		else {
			System.out.println("soy falso jeje");
		}
		
		
		var edad=9;
		var adulto= edad >=10;
		System.out.println("---> varBool si edad es mayor o igual a 10: "+adulto);
		
		if(edad>=10) {
			System.out.println("Si es mayor o igual a 10, la edad es: "+edad);
		}
		else {
			System.out.println("No es mayor o igual a 10, la edad es:"+edad);
		}
		
		System.out.println("-----char--------");

		char caracter='a';
		//seleccionas que caracter de la cadena quieres guardar 
		char caracter0="halo".charAt(2);
		//en unicode 
		char caracter1='\u058E';
		System.out.println(caracter);
		System.out.println(caracter0);
		System.out.println(caracter1);




	}

}
