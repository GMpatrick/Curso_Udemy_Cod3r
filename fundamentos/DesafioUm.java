package fundamentos;

import java.util.Scanner;

/*
 * Convertendo Farehaint para Celsius
 */

public class DesafioUm {
	
	public static void main(String[] args) {
		/*
		 * formula = (f-32) * 5 / 9 
		 * 
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		float f;
		final float trinta_dois = 32f;
		final float fator = 5.0f / 9;
		float formula;
		
		System.out.print("Digite  a temperatura em Cº: ");
		
		f = leitor.nextFloat();
		formula = (f - trinta_dois) * fator;
		
		System.out.println("A conversão de Fº para Cº sera: "+ formula);
		
		leitor.close();
	}
	
	
	
}
