package oo.heranca.desafio;

public class Dirigir {

	public static void main(String[] args) {
		Carro a1 = new Carro(89);
		
		
		a1.acelerrar();
		
		a1.ligarCarro();
		
		a1.velocidadeCarro();
		a1.acelerrar();
		a1.velocidadeCarro();
		a1.frear();
		a1.velocidadeCarro();
		a1.frear();
		a1.velocidadeCarro();
		
		a1.desligarCarro();
		a1.frear();
		
		//
		System.out.println("Vamos ver a ferrari");
		
		Carro a2 = new Ferrari(200);
		
		a2.acelerrar();
		
		a2.ligarCarro();
		
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		a2.acelerrar();
		a2.velocidadeCarro();
		

	}
}
