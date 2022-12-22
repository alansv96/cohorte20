import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros= {0,0,0,0,0,0,0,0,0,0};
		int [] aux= {0,0,0,0,0,0,0,0,0,0};
	
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("ingrese un entero en la posicion:"+i);
			numeros[i]=scanner.nextInt();
			
			}
		
		for(int i=0,k=9;i<10;i++,k--) {
			
			boolean prime = true; 
		    for(int j = 2; j < numeros[i]; j++) {
		        if (numeros[i] % j == 0) {
		            prime = false;
		            break;
		        }
		    }
		    
		    if (prime) {
		    	aux[i]=numeros[i];
		    
		    }
		    else {
		    	aux[k]=numeros[i];
		    
		    }
		    
			
			
			}
		
		
		for(int i=0;i<10;i++) {
			System.out.println(i+" "+aux[i]);
			
			}
		
		
	}

}
