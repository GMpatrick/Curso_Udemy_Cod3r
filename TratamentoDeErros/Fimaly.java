package TratamentoDeErros;

import java.util.Scanner;

public class Fimaly {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.println(7 / leitor.nextInt());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally { // em todos os casos aqui sera chamado
			System.out.println("finalmente ");
			leitor.close();
		}
		
		System.out.println("Fim");
	}
}
