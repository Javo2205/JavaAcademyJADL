import java.util.Scanner;

public class Problema1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Introduce un numero [ 2 < x > 20]: ");
		int num = scan.nextInt();

		if (num <= 20 && num >= 2) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		} else {
			System.out.println("Introduciste un numero invalido");
		}
	}
}
