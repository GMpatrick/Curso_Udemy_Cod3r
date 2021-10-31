package estruturasDeControle.desafios;

import java.util.Scanner;

public class MaiorMenorNumero {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		float resp = 0;
		
		float maiorNumero = 0, menorNumero = 0;
		
		for (int cont = 1; cont < 6; cont++ ) {
			System.out.print("Digite o "+cont+"º numero: ");
			resp = leitor.nextFloat();
			if (cont == 0) {
				maiorNumero = resp;
				menorNumero = resp;
			}
			if (cont > 0) {
				if (resp > maiorNumero ) {
					maiorNumero = resp;
				}else if(resp < menorNumero) {
					menorNumero = resp;
				}
			}
		}
		System.out.println("O maior numero digitado foi: "+ maiorNumero+", O menor numero digitado foi: "+ menorNumero);

	}
}
