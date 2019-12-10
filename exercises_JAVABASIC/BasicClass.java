package ExerciseToPractice;

public class BasicClass {

	// la declaramos globalmente para poder acceder a ella mediante el constructor
	private String x; 

	//Method
	public int getSum(int a, int b) {
		return a + b;
	}
	
	//Constructor
	public BasicClass(){
	//como constructor podemos hacer despues una instancia para acceder a esta propiedad
	x = "Soy propiedad de la clase BasicClass"; 
	}
	
	public static void main(String[] args) {
		BasicClass myObj = new BasicClass();
		System.out.println(myObj.x);
	}
	
}
