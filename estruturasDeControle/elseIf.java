package estruturasDeControle;

import java.util.Scanner;

public class elseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		double nota = entrada.nextDouble();
		System.out.print("A sua nota teve um ranking de: ");
		if (nota >= 9) {
			System.out.println("A+");
		}else if(nota >= 8.5 && nota < 9) {
			System.out.println("A");
		}else if(nota > 7 && nota < 8.5) {
			System.out.println("B");
		}else if(nota >= 6 && nota < 7) {
			System.out.println("B-");
		}else {
			System.out.println("C");
		}
		
		entrada.close();
	}
}
