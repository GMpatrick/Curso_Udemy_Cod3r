package estruturasDeControle.desafios;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			System.out.print("Informe um n�mero: ");
			int cont = leitor.nextInt(); 

			if (cont % 2 == 0) {
				System.out.println(cont+ " � par");
			}else {
				System.out.println(cont+ " � impar");
			}
			
			if(cont > 10) {
				System.out.println("Este numero n�o esta enre 0 e 10");
			}
		
	}
}
