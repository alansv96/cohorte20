package mis_clases.excepciones.ejecuta;

import mis_clases.excepciones.operacion.Division;
import mis_clases.excepciones.operacion.OpExcep;

public class TestExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Division div =new Division(4,2);
			div.visualizarD();
			
		} catch (OpExcep e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Continua...");
		
	}

}
