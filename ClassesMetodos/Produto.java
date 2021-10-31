package ClassesMetodos;

public class Produto {
	
	String nome;
	double preco;
	final static double DESCONTO = 0.25;
	
	Produto(String nomeInicial){ // construtor sempre come�a com o nome da classe
		nome = nomeInicial;
		
	}
	
	Produto(){// construtor padr�o
		
	}
	
	public double produtoDesconto() {
		
		return preco * (1 - DESCONTO);
		
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", desconto=" + DESCONTO + "]";
	}
	
	
}
