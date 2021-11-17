package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{ 

	public Ferrari(double velocidade_maxima) {
		super(velocidade_maxima);
		// TODO Auto-generated constructor stub
	}

	@Override
	void acelerrar() {
		// TODO Auto-generated method stub
		if (this.ligado == true) {
			if ((this.velocidadeAtual + 25 ) >= VELOCIDADE_MAXIMA) {
				this.velocidadeAtual = VELOCIDADE_MAXIMA;
			}else {
				this.velocidadeAtual += 25;
			}
		}else {
			System.out.println("Carro desligado, n„È possivel acelerar");
		}
	}

	@Override
	void frear() {
		// TODO Auto-generated method stub
		if (this.ligado == true) {
			if ((velocidadeAtual - 10) < 0) {
				this.velocidadeAtual = 0;
			}else {
				velocidadeAtual -= 10;
			}
				
		}else {
			System.out.println("Carro desligado, n„È possivel frear");
		}
		
	}

	@Override
	public void ligarTurbo() {
		if (this.ligado == true) {
			if ((velocidadeAtual + 10) < 0) {
				this.velocidadeAtual = 0;
			}else {
				velocidadeAtual += 80;
			}
				
		}else {
			System.out.println("Carro desligado, n„È possivel frear");
		}
		
		
	}

	@Override
	public void desligarTurbo() {
		if (this.ligado == true) {
			if ((velocidadeAtual - 80) < 0) {
				this.velocidadeAtual = 0;
			}else {
				velocidadeAtual -= 80;
			}
				
		}else {
			System.out.println("Carro desligado, n„È possivel frear");
		}
		
		
	}
	
}
