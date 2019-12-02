package com.softtek.java.academy.exercises;

public class Multiples {
	public static void main(String[] args) {
		int numeroA = 3;
		int numeroB = 5;
		int sumaMultiplos = 0;
		int sumaNoMultiplos = 0;
		
		for(int i=0; i<100; i++) {
			if(i%3==0 || i%5==0 ) {
				sumaMultiplos += i;				
			} else {
			sumaNoMultiplos += i;
			}
		}
		System.out.println("La suma de los multiplos de 3 y 5 es: " +sumaMultiplos);
		System.out.print("La suma de los no multiplos de 3 y 5 es: " +sumaNoMultiplos);
	}
}
