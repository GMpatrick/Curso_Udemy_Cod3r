package ClassesMetodos;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto(); // instanciando objetos de uma classe
		p1.desconto = 10.2f;
		p1.nome = "Pasta de dente";
		p1.preco = 2.50f;
		
		System.out.println(p1);
		
		var p2 = new Produto();
		p2.nome = "Caneta pretsa";
		p2.preco = 12.56;
		p2.desconto = 10.15;
		
		System.out.println(p2);
		
	}
}
