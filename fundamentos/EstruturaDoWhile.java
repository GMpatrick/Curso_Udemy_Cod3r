package fundamentos;

import java.util.Scanner;

public class EstruturaDoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("voce diz: ");
			texto = entrada.next();
		}while(!texto.equalsIgnoreCase("sair"));
	}
}
