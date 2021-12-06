package generics;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

/*
 * quando eu faço C extends number eu obrigo que o meu tipo re
 * ceba aquele valor*/

public class Pares <C extends Number, V>{
	private final Set<Par<C, V>> itens = new TreeSet<>();
	
	public void adicionar(C chave, V valor) {
		//posso fazer desse jeito
		
		if(chave == null ) return; // aqui ele saira do metodo 
		// caso a chave for nula
		// posso lançar até uma exceção
		
		// posso fazer desse jeito 
		if(chave != null) {
			
			Par <C,V> novoPar = new Par<C,V>(chave, valor);
			
			if(itens.contains(novoPar)) {
				itens.remove(novoPar);
			}
			
			itens.add(novoPar);
		}
	}
	public V getValor (C chave) {
		if(chave == null ) return null;
		
		Optional<Par<C,V>> paropcional =  itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
				
		return paropcional.isPresent() ? paropcional.get().getValor() : null;
	}
}
