package herencia;

public class Hija  extends Padre{
	
	private int edad;
	//private String apellido;
	

	public Hija(String nombre, String domicilio,int edad) {
		super(nombre, domicilio);
		this.edad=edad;
		
	}
	public void mostrarDatos() {
		System.out.println("el nombre es: "+nombre
				+" El domicilio es: "+domicilio+" La edad es:"+edad);
	}
	
	public void mostrarDatos(String apellido) {
		//this.apellido=apellido;
		System.out.println("el nombre es: "+nombre
				+" "+apellido+" El domicilio es: "+domicilio+" La edad es:"+edad);
	}
	
}
