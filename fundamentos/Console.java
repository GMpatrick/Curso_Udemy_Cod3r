package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = leitor.nextLine();
		
		leitor.close();
	}
}
