package ClassesMetodos;



public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("paste de dente"); // instanciando objetos de uma classe

		p1.preco = 100f;
		
		System.out.println(p1);
		
		var p2 = new Produto("Caneta preta");
		p2.preco = 12.56;

		
		Produto p3 = new Produto();
		p3.nome = "Oloquinho";
		
		System.out.println(p2);
		
		System.out.println("O preço do produto com desconto: "+p1.nome+" é = "+ p1.produtoDesconto());
		
		
	}
}
