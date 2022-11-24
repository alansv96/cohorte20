package ejecutar;
import clases.Animal;

public class EjeAnimal {
	public static void main(String[] args) {
		Animal miAnimal = new Animal("Falco","inserte raza");
		miAnimal.setEdad(3);
		 System.out.println("El nombre es"+ miAnimal.getombre());
		 System.out.println("y tiene "+ miAnimal.getEdad()+"años");
		 
		 Animal otroAnimal;
		 otroAnimal=new Animal();
		 otroAnimal.setNombre("pulgas");
		 otroAnimal.setEdad(5);
		 
		 System.out.println("El nuevo animal es: "+otroAnimal.getombre());
		 System.out.println("Su edad es: "+otroAnimal.getEdad());
	}
}
