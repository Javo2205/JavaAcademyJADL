package ExerciseToPractice;

import java.util.Scanner;

public class PoderVotar {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingresa tu edad: "); int edad = scan.nextInt();	
		int esperar = 18 - edad;
		
		if(edad>=18) {
			System.out.println("Puedes votar :D"); 
		
		} else {
			System.out.println("Tienes que esperar "+esperar + " años para votar :p");
		}
		
	}
}
