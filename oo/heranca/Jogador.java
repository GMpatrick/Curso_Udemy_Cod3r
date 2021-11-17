package oo.heranca;


public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x); // qual a distancia que um jogador esta do outro
		int deltaY = Math.abs(y - oponente.y); // qual a distancia que um jogador esta do outro
		
		// deltaX == 0 - se eles estão na mesma coluna
		// deltaY == 1 - eles estão na mesma linha
		
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
		/*
		if (direcao == Direcao.NORTE) {
			y ++;
		}*/
		
	}
}
