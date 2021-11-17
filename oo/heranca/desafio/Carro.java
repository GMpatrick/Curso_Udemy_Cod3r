package oo.heranca.desafio;


public class Carro {
	
	final double VELOCIDADE_MAXIMA;
	boolean ligado;
	double velocidadeAtual;
	
	
	
	public Carro(double velocidade_maxima) {
		VELOCIDADE_MAXIMA = velocidade_maxima;
	}
	
	void ligarCarro() {
		this.ligado = true;
	}
	void desligarCarro() {
		this.ligado = false;
	}
	
	void acelerrar() {
		if (this.ligado == true) {
			if ((velocidadeAtual += 10 ) > VELOCIDADE_MAXIMA) {
				velocidadeAtual = VELOCIDADE_MAXIMA;
			}else {
				velocidadeAtual += 10;
			}
			
		}else {
			System.out.println("Carro desligado, não é possivel acelerar");
		}
		
	}
	void frear() {
		if (this.ligado == true) {
			if ((velocidadeAtual - 5) < 0) {
				this.velocidadeAtual = 0;
			}else {
				velocidadeAtual -= 5;
			}
		}else {
			System.out.println("Carro desligado, nãé possivel frear");
		}
		
	}
	
	void velocidadeCarro() {
		System.out.println(velocidadeAtual);
	}
}
