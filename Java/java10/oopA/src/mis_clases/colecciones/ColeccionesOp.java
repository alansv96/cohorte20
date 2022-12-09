package mis_clases.colecciones;

import java.util.*;

public class ColeccionesOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		  
	       
        list.add("A");
        list.add("A");
        list.add("C");
        list.add("D");
  
       
        System.out.println("ArrayList: " + list.get(0));
        System.out.println("ArrayList: " + list.get(2));

       
        HashMap<Integer, String> hm  = new HashMap<Integer, String>();
  
       
        hm.put(null, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
  
        
        System.out.print("HashMap: " + hm.get(null));
        System.out.print("HashMap: " + hm.get(3));



	}

}
