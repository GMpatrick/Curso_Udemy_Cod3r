package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10,10);
		
		Heroi heroi = new Heroi(10,11);
		
		// estão na mesma coluna só que um do lado do outro
		
		System.out.println("Jogador 1: "+monstro.vida);
		System.out.println("Jogador 2: "+heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);


		
		System.out.println("Monstro: "+monstro.vida);
		System.out.println("Heroi: "+heroi.vida);
		
		//System.out.println("x: "+j1.x+" y: "+j1.y);
		
		
	}

}
