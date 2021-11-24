package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTesteTres {
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> {
			return  x + y;
		}; 
		// essa é uma função lambda
		// quando se cria uma lambda ela tem que ser asso
		//ciada a uma interface
		// bynary operator pega dois parametros iguais e retorna o mesmo tipo
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		
		BinaryOperator<Integer> calc2 = (x, y) -> {
			return  x + y;
		}; 
		// essa é uma função lambda
		// quando se cria uma lambda ela tem que ser asso
		//ciada a uma interface
		// bynary operator pega dois parametros iguais e retorna o mesmo tipo
		
		System.out.println(calc2.apply(2, 3));
		
	}
}
