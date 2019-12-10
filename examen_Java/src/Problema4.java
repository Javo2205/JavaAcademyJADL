
public class Problema4 {
public String middleWay(int[] a, int[] b) {
		
		return a[1] + " " + b[1];
	}

	public static void main(String[] args) {		
		
		int[] arregloA = {1,2,3};
		int[] arregloB = {4,5,6};
		int[] arregloC = {7,7,7};
		int[] arregloD = {3,8,0};

		Problema4 myObj = new Problema4();
		System.out.println("Los valores del medio son: "+myObj.middleWay(arregloA, arregloB));
		System.out.println("Los valores del medio son: "+myObj.middleWay(arregloC, arregloD));
	}
}
