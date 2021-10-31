package ClassesMetodos.desafios;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida macarrao = new Comida("Macarrao", 3);
		Pessoa patrick = new Pessoa("Patrick", 73.2);
		
		System.out.println(patrick.peso);
		patrick.comer(macarrao);
		System.out.println(patrick.peso);
	}
}
