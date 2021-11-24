package Lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		Calculo multiplicacao = new Multiplicar();
		
		
		System.out.println(soma.executar(10, 20));
		System.out.println(multiplicacao.executar(10, 20));
		
	}
}
