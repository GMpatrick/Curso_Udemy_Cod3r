package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float resp = 0;
		int qtdNum = 0, qtdNumTot = 0;
		int notasInvalidas = 0;
		float mediaIni = 0, mediaNotasInvalidas = 0, mediaFim = 0;
		
		while (resp != -1F) {
			
			System.out.print("Digite um número (-1 para sair): ");
			resp = leitor.nextFloat();
			
			if (resp > 10 || resp < 0) {
				if (resp == -1) {
					notasInvalidas --;
				}
				notasInvalidas ++;
				mediaNotasInvalidas = mediaNotasInvalidas + resp;
			}
			if (resp == -1) {
				qtdNum --;
			}
			
			qtdNum ++;
			mediaIni = mediaIni + resp;
		}
		
		qtdNumTot = qtdNum - notasInvalidas;
		mediaFim = (mediaIni - mediaNotasInvalidas) / qtdNumTot;
		
		leitor.close();
		
		System.out.println("A quantidade de notas digitadas foram: "+qtdNumTot);
		System.out.println("A quantidade de notas invalidas digitadas foram: "+ notasInvalidas);
		System.out.println("A medias das notas é: "+mediaFim);
	}
}
