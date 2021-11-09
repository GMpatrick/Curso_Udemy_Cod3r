package ClassesMetodos;

public class EqualsHashcode {
	
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2); // O resultado ira ser falso, pois ele esta comparando resultados de memoria
		System.out.println(u1.equals(u2));
		
		
	}
}
