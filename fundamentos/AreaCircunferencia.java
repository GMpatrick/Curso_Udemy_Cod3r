package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		//pi = 2; não posso mudar pq declarei como final, que transforma em constante 
		//É convencional declarar constantes em letra maiuscula
		
		double area = PI * raio * raio;
		
		System.out.println(area);
	}
	
}
