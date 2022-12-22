package sa_lpd9;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("casa", "house");
		diccionario.put("silla", "chair");
		diccionario.put("mesa", "table");
		diccionario.put("perico", "parrot");
		diccionario.put("arbol", "tree");
		diccionario.put("tienda", "store");
		diccionario.put("manzana", "apple");
		diccionario.put("platano", "banana");
		diccionario.put("zanahoria", "carrot");
		diccionario.put("caballo", "horse");
		diccionario.put("roca", "rock");
		diccionario.put("piedra", "stone");
		diccionario.put("libro", "book");
		diccionario.put("lapiz", "pencil");
		diccionario.put("avion", "plane");
		diccionario.put("agua", "water");
		diccionario.put("fuego", "fire");
		diccionario.put("sol", "sun");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ingrese la palabra que desea traducir ");
		String palabra= scanner.nextLine();
		if(diccionario.get(palabra)==null)
			System.out.println("la palabra no esta en el diccionario");
		else
		System.out.println(diccionario.get(palabra));

	}

}
