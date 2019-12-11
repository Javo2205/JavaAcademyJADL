package examenJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problema8 {
	public static void main(String[] args) {
		List<String> paises = new ArrayList<>();
		paises.add("Sudafrica");
		paises.add("Egipto");
		paises.add("Turquia");
		paises.add("Rusia");
		paises.add("China");
		paises.add("India");

		List<String> paises2 = new ArrayList<>();
		paises2.add("Francia");
		paises2.add("México");
		paises2.add("Australia");
		paises2.add("Italia");
		paises2.add("Argentina");
		paises2.add("Brasil");

		List<String> todosPaises = new ArrayList<String>();
		todosPaises.addAll(paises);
		todosPaises.addAll(paises2);
		// System.out.println(todosPaises);
		
		Collections.sort(todosPaises);
		for (String string : todosPaises) {
			System.out.println(" "+string);
		}
	}
}
