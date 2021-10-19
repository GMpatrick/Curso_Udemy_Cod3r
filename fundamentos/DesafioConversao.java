package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		
		System.out.print("Digite o primeiro salario: ");
		salario1 = leitor.nextLine();
		
		Double sl1 = Double.parseDouble(salario1.replace(",", "."));
		
		System.out.print("Digite o segundo salario: ");
		salario2 = leitor.nextLine();
		
		double sl2 = Double.parseDouble(salario2.replace(",", "."));
		
		System.out.print("Digite o terceiro salario: ");
		salario3 = leitor.nextLine();
		
		double sl3 = Double.parseDouble(salario3.replace(",", "."));
		
		double mediaSalarial = (sl1 + sl2 + sl3) / 3;
		
		System.out.print("A media salarial é: "+ mediaSalarial);
	}
}
