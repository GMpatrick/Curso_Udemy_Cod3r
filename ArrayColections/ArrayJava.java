package ArrayColections;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayJava {
	/*
	 um array é uma estrutura estatica. no momento da criação do array
	 tera que ser dito quantos valores o array vai ter
	 
	  array é um objeto
	  
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int[] a = new int[2]; // declarando um array
		
		int[][] b = new int[10][10]; //arry dentro de array
		
		double [] notasAluno = {0,10,20,30};
		
		
		for(int cont = 0; cont < a.length; cont++) {// jogando dados para o array
			System.out.print("Digite um valor para o array na posi["+cont+"]: ");
			a[cont] = leitor.nextInt();
			
		}
		System.out.println("====================");
		for(int cont = 0; cont < a.length; cont++) {// lendo um array
			System.out.println("posição: "+cont+" valor: "+a[cont]);
			
		}
		System.out.println("====================");
		System.out.println(Arrays.toString(a)); // ler um array
	}
}
