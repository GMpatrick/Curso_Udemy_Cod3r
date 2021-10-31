package estruturasDeControle.desafios;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
	
	public static void main(String[] args) {
		
		Random  numero = new Random ();
		Scanner leitor = new Scanner(System.in);
		
		
		int computador; 
		int resp = 0;
		
		computador = numero.nextInt(11);
		
		System.out.println(computador);
		
		while (resp != computador) {
			System.out.println(" ");
			System.out.print("Tente advinhar o numero que o cumptador esta pensando: ");
			resp = leitor.nextInt();
			System.out.println(" ");
			if (resp != computador) {
				System.out.println("Não é a resposta certa, tente novamente...");
				System.out.println("========== PERDEDOR ==========");
			}
		}
		System.out.println("========== VENCEDOR ==========");
		System.out.println("Parabens o numero que o computador pensou foi o "+computador);
		
	}
}
