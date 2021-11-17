package oo.composicaoo;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		
		c1.cliente = "João pedro";
		c1.itens.add(new Item("Martelo", 4, 12.90));
		c1.itens.add(new Item("Maquita", 1, 29.90));
		c1.itens.add(new Item("Prego", 1, 0.55));
		c1.itens.add(new Item("Lampada", 2, 7.00));
		
		
		System.out.println(c1.itens.size());
		
		System.out.println(c1.obterValorTotal());
	}
}
