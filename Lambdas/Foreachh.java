package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreachh {
	
	public static void main(String[] args) {
		List<String> aprovados =  Arrays.asList("Ana", "Bia", "Gui");
		
		System.out.println("Forma tradicional");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01");
		
		aprovados.forEach((nome) -> {System.out.println(nome);} );
		
		
		System.out.println("\n method reference");
		aprovados.forEach(System.out::println);  // passando uma referencia
		
		meuImprimir("Patrick");
	}
	
	public static void meuImprimir(String nome) {
		System.out.println("Oi! meu nome é: "+nome);
	}
	
	
}
