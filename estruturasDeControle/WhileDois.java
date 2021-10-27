package estruturasDeControle;

import java.util.Scanner;

public class WhileDois {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String resp = "";
		
		while (!resp.equalsIgnoreCase("sair")) { // enquanto resp for diferente de sair
			System.out.print("Digite algo: ");
			resp = entrada.nextLine();
		}
		
		entrada.close();
		
	}
}
