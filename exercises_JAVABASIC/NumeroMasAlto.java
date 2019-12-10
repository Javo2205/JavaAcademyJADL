package ExerciseToPractice;

import java.util.Scanner;

public class NumeroMasAlto {
	//static int grupoNumeros[] = {10, 20 ,30}; 
	static int[] grupoNumeros = new int [3];
	static Scanner scan = new Scanner(System.in);
	
    static int NumeroMayor() 
    { 
        int i; 
          
        // Inicializamos
        int max = grupoNumeros[0]; 
        
        for (int j = 0; j < grupoNumeros.length; j++) {
			System.out.print("numero ("+j+"): ");
			int numeroArreglo = scan.nextInt();
			grupoNumeros[j] = numeroArreglo;
		}
       
        //Recorremos el arreglo haciendo comparciones entre los numero en las posiciones
        //Si el numero resulta ser mayor lo guardamos en la variable max
        //La cual al final del recorrido tendra el numero mayor dentro del arreglo
        for (i = 1; i < grupoNumeros.length; i++) 
            if (grupoNumeros[i] > max) 
                max = grupoNumeros[i];
       
        return max; 
    } 
      
    public static void main(String[] args)  
    { 
        System.out.println("El numero mas grande en el arreglo es " + NumeroMayor()); 
       } 
}
