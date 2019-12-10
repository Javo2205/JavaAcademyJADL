package Problema7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Problema7 {
	static Map<String, String> mapExamen = new HashMap<String, String>();

	public String obtenerPersonaje(String llave){
		String data2 = llave +  " "  + mapExamen.get(llave);  
		System.out.println(llave + " " + (mapExamen.get(llave)));
		//PrintStream fileStream = new PrintStream(
				//"C:\\Users\\curso\\Documents\\workspace-threads1\\Examen\\src\\Problema7\\problema7.txt");
		//System.setOut(fileStream);
		return data2;
	}

	private static void ImprimirAtxt(String data) {
		File file = new File("C:\\Users\\curso\\Documents\\workspace-threads1\\Examen\\src\\Problema7\\problema7_Jeff_2.txt");

		FileWriter fr = null;
		try {
			fr = new FileWriter(file);
			fr.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close resources
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		//Strind dataOut = myObj
		//String data = "Aqui va la informacion de Jeff Bezos";
		Problema7 myObj = new Problema7();

		mapExamen.put("a1234", "Steve Jobs");
		mapExamen.put("a1235", "Scott McNealy");
		mapExamen.put("a1236", "Jeff Bezos");
		mapExamen.put("a1237", "Larry Ellison");
		mapExamen.put("a1238", "Bill Gates");

		//myObj.obtenerPersonaje("a1236");
		//myObj.toString();
		
		ImprimirAtxt(myObj.obtenerPersonaje("a1236"));

	}
}
