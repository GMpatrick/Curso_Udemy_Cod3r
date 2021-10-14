package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.err.println("Ola pessoal".charAt(2)); // pegar o carctere especifico
		
		String s = "BOa tarde";
		
		System.out.println(s.concat("teste")); // juntar String
		
		System.out.println(s.startsWith("boa")); // iniciar com uma palavra
		System.out.println(s.endsWith("tarde")); // terminar com uma palavra
		
		System.out.println(s.length()); // tamanho da string
		
		System.out.println(s.equals("Ola pessoal")); // comparação
		System.out.println(s.equalsIgnoreCase("BoA TARde")); // comparação ignorando letras maiusculas etc..
		
		var nome = "Pedro";
		
		
		
	}
}
