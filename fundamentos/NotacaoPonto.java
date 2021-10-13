package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia x";
		
		s = s.toUpperCase(); // converter a string em letra maiuscula
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); // substitui
		System.out.println(s);
		
		s = s.concat("!!!"); // concatena a string
		System.out.println(s);
		
		// tipos primitivos não tem operador
		
	}
}
