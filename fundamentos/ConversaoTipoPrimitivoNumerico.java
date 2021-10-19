package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		float b = 1.0F; // pode ser feita desta forma
		float c = (float) 1.0; // e tambem pode ser feita desta forma chamada de cast, é uma conversão explicita
		
		int d = 340;
		byte e = (byte) d; // pega o valor de c comverte para byte, explicita(cast)
		
		double f = 1.9999999;
		int g = (int) f;
		
		System.out.println(f);
		
		
	
	}
}
