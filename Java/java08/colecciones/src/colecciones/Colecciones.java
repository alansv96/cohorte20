package colecciones;
import java.util.*;




public class Colecciones {
	//metodo para imprimir elementos de colecciones
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}

	
	public static void main(String[] args) {
		//List - ArrayList
		System.out.println("-----ArrayList");
		
		List<String> miArray = new ArrayList<String>();  
		
		miArray.add("GDL");
		miArray.add("CDMX");
		miArray.add("MTY");
		miArray.add(1,"Manzanillo");
		
		String valorQuitado = miArray.remove(0);
		//Boolean valorQuitado = miArray.remove("GDL");

		System.out.println(miArray);
		System.out.println(valorQuitado);
		System.out.println(miArray.get(2));
		System.out.println(miArray.size());
		
		imprimir(miArray);
		
		System.out.println("----HashSet----");
		//ES la mas rapida de todas
		//No permiten elementos duplicados
		// no guarda los elementos en un orden aparente
		//no maneja índice 
		Set<String>miSet=new HashSet<String>();
		
		miSet.add("Panchito");
		miSet.add("Paco");
		miSet.add("Juan");
		miSet.add("Juan");
		miSet.add("Martín");
		
		System.out.println(miSet);
		imprimir(miSet);
		System.out.println(miSet.contains("martin"));
		miSet.remove("Martín");
		System.out.println(miSet);
		
		
		System.out.println("----HashMap----");
		//pares de valores llave-valor
		Map<String,Integer> miMap=new HashMap<String,Integer>();
		
		miMap.put("Valor 1",56);
		miMap.put("Valor 2",56);
		miMap.put("Valor 3",70);
		
		System.out.println(miMap);
		System.out.println(miMap.get("Valor 2"));
		System.out.println(miMap.keySet());
		//recorer el map
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}



		
		





		
		


	}
}
