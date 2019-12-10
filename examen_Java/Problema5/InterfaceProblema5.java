package Problema5;

public interface InterfaceProblema5 {
	default void suma(int numA, int numB) {
		System.out.println("Suma = "+(numA+numB));
	}
	default void resta(int numA, int numB) {
		System.out.println("Resta = "+(numA-numB));
	}
	default void multp(int numA, int numB) {
		System.out.println("Multiplicacion = "+(numA*numB));
	}
	default void div(int numA, int numB) {
		System.out.println("Division = "+(numA/numB));
	}
}
