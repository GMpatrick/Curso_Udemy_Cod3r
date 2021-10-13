package fundamentos;


public class Inferencia {
	
	public static void main(String[] args) {
	
		double a = 4.5; // declaração e inicialização da variavel
		System.out.println(a);
		
		// inferencia de dados é o java escolher qual tipo de dado sera colocado qaundo voce não informa o tipo
		var b = 4.5; // 
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		System.out.println();
		
		double d; // declaração da variavel
		
		d = 126.65; // iniciando a variavel
		System.out.println(d);
		
		
		
	}
}
