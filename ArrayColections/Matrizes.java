package ArrayColections;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
	
	public static void main(String[] args) {
		
		int aluno, notas;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o numero de alunos: ");
		aluno = leitor.nextInt();
		
		System.out.print("Informe o numero de notas: ");
		notas = leitor.nextInt();
		
		double[][] alunoNotas = new double [aluno][notas];
		
		for(int i = 0; i < alunoNotas.length; i++) {
			
			for(int j = 0; j < alunoNotas[i].length; j++) {
				System.out.print("Aluno "+(i + 1) +" nota "+(j + 1)+": ");
				alunoNotas[i][j] = leitor.nextDouble();
			}
		}
		
		for (double[] ds : alunoNotas) {
			System.out.println(Arrays.toString(ds));
		}
		
		System.out.println("===========================");
		for(int i = 0; i < alunoNotas.length; i++) {
			
			for(int j = 0; j < alunoNotas[i].length; j++) {
				System.out.println("Aluno "+ (i + 1) +" nota "+ (j + 1) + ": "+alunoNotas[i][j]);
				
			}
		}
	}
}
