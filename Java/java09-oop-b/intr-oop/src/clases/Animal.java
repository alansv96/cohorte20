package clases;

public class Animal {
	String raza;
	String nombre;
	int edad;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, String raza) {
		this.nombre=nombre;
		this.raza=raza;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		
		this.edad=edad;
	}
	
}
