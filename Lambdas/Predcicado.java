package Lambdas;

import java.util.function.Predicate;

public class Predcicado {
	public static void main(String[] args) {
		
		// predicado retorna verdadeiro ou falso
		
		Predicate<Produto> isCaro = 
				prod -> prod.preco  >= 750; // maior que 750 seria um produto caro
		
		Produto produto = new Produto("Notbook", 3893.89, 0.15);
		
		System.out.println(isCaro.test(produto));
	}
}
