package fundamentos;


public class Inferencia {
	
	public static void main(String[] args) {
	
		double a = 4.5; // declara��o e inicializa��o da variavel
		System.out.println(a);
		
		// inferencia de dados � o java escolher qual tipo de dado sera colocado qaundo voce n�o informa o tipo
		var b = 4.5; // 
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		System.out.println();
		
		double d; // declara��o da variavel
		
		d = 126.65; // iniciando a variavel
		System.out.println(d);
		
		
		
	}
}
