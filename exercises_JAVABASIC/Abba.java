package ExerciseToPractice;

public class Abba {
	 public void makeAbba( String a, String b ){
		System.out.println(a+b+b+a);
	}
	
	public static void main(String[] args) {
		Abba myObj = new Abba();
		
		myObj.makeAbba("Hi", "Bye"); 
		myObj.makeAbba("Yo", "Allice");
		myObj.makeAbba("What", "Up");
	}
}
