package StreamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		System.out.println("For normal");
		List<String> aprovados = Arrays.asList("Lu","gui", "Ana");
		
		// maneiras de mostrar as litas em tela
		
		for(int i  = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
	
		System.out.println("usando o foreach");
		// usando o foreach
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		// usando o iterator
		/*
		 Iterator é uma interface do java ela tem dois metodos
		 um ele retorna verdadeiro ou falso(tem proximo?)
		 existe algum elemento depois desse iterator
		 Iteração = repetição(voce passar por todos os elementos dessa lista)
		 */
		
		System.out.println("usando o iterator");
		
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()){// enquanto tem proximo {
			System.out.println(iterator.next());
		}
		
		System.out.println("usando Stream api");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);

	}
}
