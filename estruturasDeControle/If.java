package estruturasDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		double nota = entrada.nextDouble();
		
		if (nota >= 10) {
			System.out.println("Parabens voce � um aluno incrivel");
		}else {
			System.out.println("Voce � um aluno horrivel");
		}
		
		entrada.close();
		
	}
}
