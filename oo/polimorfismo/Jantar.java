package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado  = new Pessoa(99.65);
		
		Arroz ingre1 = new Arroz(0.2);
		Feijao ingre2 = new Feijao(0.5);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingre1);
		convidado.comer(ingre2);
		
		System.out.println(convidado.getPeso());
		
	
	} 

}
