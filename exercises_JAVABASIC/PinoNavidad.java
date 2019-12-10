package ExerciseToPractice;
import java.util.Scanner;

public class PinoNavidad {
	private static Scanner scanner;

	public static void main(String[] args){
		
		scanner = new Scanner(System.in);	
		
		System.out.print("¿De que tamaño quieres el pino?(1-10):  ");
		int tamañoPino = scanner.nextInt();
		if(tamañoPino <= 10) {
			//System.out.print(tamañoPino);
			for(int i=tamañoPino; i>0; i--) {
				//System.out.print("*");
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}	
				System.out.println(" ");
			}
			
		} else { System.out.print("Debes ingresar el tamaño del pino del 1 al 10 "); }
	}
}
