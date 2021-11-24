package Lambdas;

public class CalculoTesteDois {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {
			return x + y;
		}; // essa é uma função lambda
		// quando se cria uma lambda ela tem que ser asso
		//ciada a uma interface
		
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y;
		
		System.out.println(Calculo.muitoLegal());
		
		
		
	}
}
