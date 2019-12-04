import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa el numero A: ");
        int numeroA = scan.nextInt();
        System.out.print("Ingresa el numero B: ");
        int numeroB = scan.nextInt();
        System.out.println();
        
        System.out.println("Numeros a analizar, a="  +numeroA+ " b=" +numeroB);
        System.out.println("Suma = " +(numeroA+numeroB));
        System.out.println("Resta = " +(numeroA-numeroB));
        System.out.println("Multiplicacion = " +(numeroA*numeroB));
        System.out.println("Division = " + (double)numeroA/numeroB);
    }
}