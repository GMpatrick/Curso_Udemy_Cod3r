package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("PAtrick eduardo alves");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto(5.14, "calculadora"),11);
		
		System.out.println(cliente.obterValorTotal());
	}
}
