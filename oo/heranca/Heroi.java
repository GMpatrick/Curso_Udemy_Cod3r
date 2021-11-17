package oo.heranca;
/*
 * para fazer o ataque do heroi ficar mais forte pode ser feito de duas formas
 */
public class Heroi extends Jogador{ // definindo herança através do extends
	
	
	
	Heroi(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2; // se ataque 1 e  ataque dois foi falso ele retornara false
		
		
	}
}
