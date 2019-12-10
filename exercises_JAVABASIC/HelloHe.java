package ExerciseToPractice;

public class HelloHe {
	public static void main(String[] args) {
		String cadenaOriginal = args[0];
		String subCadena = "";
		if (cadenaOriginal.length() < 2) {
			System.out.println(cadenaOriginal);
		} else {
			//             1  2  3  4  5  6  7
			//Palabra dada V  i  r  t  u  a  l
			//Retorno Vi
			/*El conteo empieza desde 1 pero de al hacer uso del metodo es de 0 a donde 
			queramos imprimir*/
			subCadena = cadenaOriginal.substring(0, 2);
		}
		System.out.println(cadenaOriginal.length());
		System.out.println("La subcadena es " + subCadena);
	}
}
