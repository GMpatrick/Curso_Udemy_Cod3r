package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.aguardar("410");
		
		caixaA.abrir();
		System.out.println("O que tem dentro da caixa? "+caixaA.abrir());
	}
	
}
