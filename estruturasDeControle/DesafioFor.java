package estruturasDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		
		for(int i = 1; i<= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		// o desafio � n�o poder usar valores num�ricos para controlar o for
		
		for (String v = "#"; !v.equals("######"); v+= "#") {
			System.out.println(v);
		}
		
		
	}
}