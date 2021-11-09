package ArrayColections;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSetDois {
	public static void main(String[] args) {
		Set <String> lista = new HashSet<String>();
		// quando eu coloco <String> eu to definindo que o meu conjunto é do tipo String
		
		lista.add("Ana");
		lista.add("Maria");
		lista.add("Patrick");
		lista.add("Jane");
		lista.add("Carlos");
		
		for (String teste : lista) {
			System.out.println(teste);
		}
	}
}
