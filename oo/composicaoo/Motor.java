package oo.composicaoo;

public class Motor {
	// relação um para um (unidirecional)
	// o carro se relaciona com o motor e o motor se
	// relaciona com o carro
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	
	int giros() { 
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao *3000);
		}
		
	}
}
