package oo.composicaoo;

public class Carro {
	
	// rela��o um para um (unidirecional)
	// o carro se relaciona com o motor e o motor se
	// relaciona com o carro
	
	Motor motor = new Motor();
	
	void acelerar () {
		if (motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 4;
		}
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 4;
		}
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado () {
		return motor.ligado;
	} 
}
