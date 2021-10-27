package fundamentos;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c  = a + b;
		
		c = c + b;
		
		c += b; // mesma coisa que isso c = c + b;
		
		c -= a; // mesma coisa que isso c = c - b;
		
		c *= a; // mesma coisa que isso c = c * b;
		
		c /= a; // mesma coisa que isso c = c * b;
		
		c++; // c = c + 1;
	}
}
