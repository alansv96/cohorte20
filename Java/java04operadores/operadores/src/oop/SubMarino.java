package oop;

public class SubMarino {
	//main temporal 
	
	 void submenu() {
		Menu m=new Menu();
		OperacionesAritmeticas oa =new OperacionesAritmeticas();
		
		do {
			switch(m.subMenu()) {
			case 1:
				System.out.println(oa.suma());
				break;
			case 2:
				System.out.println(oa.resta());
				break;
			case 3:
				System.out.println(oa.mult());
			case 4:
				System.out.println(oa.div());
			case 5:
				System.out.println(oa.modulo());
			case 6:
				break;
			}
		}while(m.subMenu() !=7);
		
	




			
			
		
		
	}
	
	


}
