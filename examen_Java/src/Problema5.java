import Problema5.InterfaceProblema5;

public class Problema5 implements InterfaceProblema5  {
	public static void main(String[] args) {		
		//InterfaceProblema5 myObj = new InterfaceProblema5();
		int num1 = 100;
		int num2 = 20;
		
		Problema5 myObj = new Problema5();
		
		System.out.println("Operacions basica: num1= "+num1+ " num2= "+num2);
		myObj.suma(num1, num2);
		myObj.resta(num1, num2);
		myObj.multp(num1, num2);
		myObj.div(num1, num2);
	}
}
