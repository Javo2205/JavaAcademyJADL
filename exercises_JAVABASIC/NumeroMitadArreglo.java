package ExerciseToPractice;

import java.util.Scanner;

public class NumeroMitadArreglo {

	public String middleWay(int[] a, int[] b) {
		
		return a[1] + " " + b[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int[] myArrayA = new int[3];
		// int[] myArrayB = new int[3];
		/*
		 * System.out.println("Ingresa los elementos del array1:"); for (int i = 0; i <
		 * myArrayA.length; i++) { myArrayA[i] = sc.nextInt(); }
		 * 
		 * System.out.println("Ingresa los elementos del array2:"); for (int i = 0; i <
		 * myArrayB.length; i++) { myArrayB[i] = sc.nextInt(); }
		 * 
		 * for (int i = 0; i < myArrayA.length; i++) { System.out.println(myArrayA[i]);
		 * }
		 * 
		 * for (int i = 0; i < myArrayB.length; i++) { System.out.println(myArrayB[i]);
		 * }
		 */
		
		int[] arregloA = {5,6,7};
		int[] arregloB = {8,9,10};
		int[] arregloC = {11,12,13};
		int[] arregloD = {14,15,16};
		int[] arregloE = {17,18,19};
		int[] arregloF = {20,21,22};

		NumeroMitadArreglo myObj = new NumeroMitadArreglo();
		System.out.println("Los valores del medio son: "+myObj.middleWay(arregloA, arregloB));
		System.out.println("Los valores del medio son: "+myObj.middleWay(arregloC, arregloD));
		System.out.println("Los valores del medio son: "+myObj.middleWay(arregloE, arregloF));
	}
}
