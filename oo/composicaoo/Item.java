package oo.composicaoo;

public class Item {
	// relacionamento um pra muitos
	// uma compra pode ter varios itens
	// e um item pode ter uma compra
	
	String nome;
	int quantidade;
	double preco;
	
	
	public Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	

	
}
