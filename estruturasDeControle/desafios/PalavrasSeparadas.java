package estruturasDeControle.desafios;

public class PalavrasSeparadas {
	public static void main(String[] args) {
		 int i=0;
	        String palavra = "teste";
	        int qtd = palavra.length();

	        for(i=0;i<qtd;i++)
	           System.out.print(palavra.charAt(i) + " ");

	        System.out.println("\nPossue " + qtd + " letras.");
	}
}
