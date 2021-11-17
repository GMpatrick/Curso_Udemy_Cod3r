package oo.composicaoo;

import java.util.ArrayList;

public class Compra {
	// relacionamento um pra muitos
	// uma compra pode ter varios itens
	// e um item pode ter uma compra
	
	String cliente;
	
	ArrayList<Item> itens = new  ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
			
		for (Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
}
