package mis_clases.excepciones;

public class EjemploExcep {
	
	public static int dividir(int a,int b) {
		int r=0;

		try {	
			r=a/b;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no se puede dividir entre cero");
		}
		
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dividir(4,0));
	}

}
