package ArrayColections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList <Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Patrick");
		
		lista.add(u1);// formas de adicioanr a lista
		lista.add(new Usuario("Maria")); // formas de adicionar a lista
		lista.add(new Usuario("bruna"));
		lista.add(new Usuario("michele"));
		lista.add(new Usuario("amanda"));
		
		System.out.println(lista.get(1).nome); // pegar pelo id
		
		// formas de remover
		lista.remove(0); // removendo pelo indice
		lista.remove( new Usuario("Maria"));
		
		
		// listar a lista
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		
	}
}
