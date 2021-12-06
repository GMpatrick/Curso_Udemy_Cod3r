package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaA.aguardar(2.3);// ele vai fazer a conversão para uma classe do tipo double // double -> Double
		
		Integer coisa = (Integer)caixaA.abrir();
		/*
		 * Primeiro ele retorna um Object qaundo eu recebo o metodo abrir
		 * como não trabalhamos a nivel de object eu terei que fazer um cast
		 * e este é um cast perigoso por que aquilo que for retornado tem que ser do tibo int se caso for um double ira dar problema como nesse caso */
		
		caixaB.aguardar("Ola");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB); // neste exemplo daria certo
	}
}	
