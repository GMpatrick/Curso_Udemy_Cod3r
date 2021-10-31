package estruturasDeControle.desafios;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			System.out.print("Informe um número: ");
			int cont = leitor.nextInt(); 

			if (cont % 2 == 0) {
				System.out.println(cont+ " é par");
			}else {
				System.out.println(cont+ " é impar");
			}
			
			if(cont > 10) {
				System.out.println("Este numero não esta enre 0 e 10");
			}
		
	}
}
