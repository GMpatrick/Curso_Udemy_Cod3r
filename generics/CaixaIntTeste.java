package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		CaixaInt caixa1 = new CaixaInt();
		caixa1.aguardar(10);
		System.out.println(caixa1.abrir());
	}
}
