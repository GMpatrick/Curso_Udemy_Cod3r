package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerrr {
	// consumerr não retorna nada, seria como se fosse um void
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Notbook", 3893.89, 0.15);
		
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caderno", 15.55, 0.15);
		Produto p3 = new Produto("Mochila", 112.89, 0.15);
		Produto p4 = new Produto("Lapis da silva", 0.15, 0.15);
		Produto p5 = new Produto("Caneta", 3, 0.15);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		
	}	
}
