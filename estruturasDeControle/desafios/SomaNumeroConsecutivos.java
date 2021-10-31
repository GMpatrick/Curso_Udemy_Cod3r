package estruturasDeControle.desafios;

import java.util.Scanner;

public class SomaNumeroConsecutivos {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float resp = 0, soma = 0;
		
		while (resp >= 0) {
			System.out.print("Digite um numero: ");
			resp = leitor.nextFloat();
			System.out.println(" ");
			soma = soma + resp;
			if (resp < 0 ) {
				soma -= resp;
			}
		}
		
		System.out.println("O resultado final das somas foi: "+soma);
	}
}
