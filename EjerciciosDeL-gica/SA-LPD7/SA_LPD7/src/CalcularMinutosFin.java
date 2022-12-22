import java.util.Scanner;

public class CalcularMinutosFin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Por favor, introduce un día de la semana de lunes a viernes: ");
	    String dia = scanner.nextLine().toLowerCase();
	    System.out.print("Por favor, introduce una hora en formato militar (las 14:30 sería 1430): ");
	    int horaUs = scanner.nextInt();
	    int hora = (int)horaUs/100;
	    int min = (horaUs - hora*100);
	    if ((hora < 0) || (hora > 23) || (min < 0) || (min > 59)){
	      System.out.println("Lo siento, el formato de la hora no es correcto");
	    } else {
	      int falta;
	      switch (dia){
	        case "lunes":
	          falta = ((23-hora)*60+(60-min))+24*60*3+15*60;
	          System.out.println("Faltan " + falta + " minutos para el fin de semana");
	          break;
	        case "martes":
	          falta = ((23-hora)*60+(60-min))+24*60*2+15*60;
	          System.out.println("Faltan " + falta + " minutos para el fin de semana");
	          break;
	        case "miercoles":
	          falta = ((23-hora)*60+(60-min))+24+15*60;
	          System.out.println("Faltan " + falta + "minutos para el fin de semana");
	          break;
	        case "jueves":
	          falta = ((23-hora)*60+(60-min))+15*60;
	          System.out.println("Faltan " + falta + " minutos para el fin de semana");
	          break;
	        case "viernes":
	          falta = (14-hora)*60+(60-min);
	          System.out.println("Faltan " + falta + " minutos para el fin de semana");
	          break;
	        default:
	          System.out.println("El día '" + dia + "' no es válido.");
	          break;
	      }
	    }
		
	}

}
