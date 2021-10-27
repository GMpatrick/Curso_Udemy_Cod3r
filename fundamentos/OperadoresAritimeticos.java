package fundamentos;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		var x = 36.86;
		double y = 10.15;
		
		System.out.println( x + y);
		System.out.println( x - y);
		System.out.println( x * y);
		System.out.println( x / y);
		
		int a = 8, b = 3 ;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // divisão de inteiros retorna um int
		
		System.out.println( 8 % 3);
		System.out.println( a % b);
	}
}
