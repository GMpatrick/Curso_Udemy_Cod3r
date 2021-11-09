package ArrayColections.exercicios;

import java.util.Scanner;

public class MediaNotasAlunos {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int resposta;
		double soma = 0;
		
		System.out.print("Quantas notas você que adicionar: ");
		resposta = leitor.nextInt();
		
		double[] notas = new double[resposta]; 
		
		for(int cont = 0; cont < notas.length; cont++) {
			System.out.printf("Digite a nota %d: ", cont+1);
			notas[cont] = leitor.nextDouble();
		}
		
		System.out.println("===========================");
		System.out.println("As notas digitadas foram... ");
		for (double d : notas) {
			soma = soma + d;
			System.out.println(d);
		}
		
		System.out.println("===========================");
		System.out.println("A media entre as notas é: "+soma/notas.length);
		
		
	}
}
