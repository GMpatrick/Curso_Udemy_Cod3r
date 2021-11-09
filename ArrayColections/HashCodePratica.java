package ArrayColections;

import java.util.HashSet;

public class HashCodePratica {
	public static void main(String[] args) {
		HashSet<Usuario> usuario = new HashSet<>();
		
		usuario.add(new Usuario("Patrick"));
		usuario.add(new Usuario("Maria"));
		usuario.add(new Usuario("Vitoria"));
		
		boolean resultado = usuario.contains(new Usuario("Patrick"));
		System.out.println(resultado);
	}
}
