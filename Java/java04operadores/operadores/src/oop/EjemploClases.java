package oop;

public class EjemploClases {
	static void cambio()
	{
		Tablas t = new Tablas();
		Menu m=new Menu();
		SubMarino sm=new SubMarino();
		int op=m.menuOp();
		
		switch (op) {
		case 1:
			t.tabla ();
			break;
			
		case 2:
			sm.submenu();
			break;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjemploClases.cambio();
		

	}

}
