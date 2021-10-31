package estruturasDeControle.desafios;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o ano para saber se ele é bissexto: ");
		int ano = leitor.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O ano é bissexto");
		}else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
			System.out.println("O ano é bissexto");
		}else {
			System.out.println("O ano não é bissexto");
		}
	}
}	
