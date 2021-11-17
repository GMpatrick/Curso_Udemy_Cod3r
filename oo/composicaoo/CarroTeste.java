package oo.composicaoo;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		// relação um para um (unidirecional)
		// o carro se relaciona com o motor e o motor se
		// relaciona com o carro
		
		Carro c = new Carro();
		
		System.out.println(c.estaLigado());
		
		if (c.estaLigado() == false) {
			c.ligar();
		}
		
		System.out.println(c.estaLigado());
		
		System.out.println(c.motor.giros());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giros());
		
		c.frear();
		
		System.out.println(c.motor.giros());
	}
}
