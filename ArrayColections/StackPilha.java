package ArrayColections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {
	public static void main(String[] args) {
		// primeiro a entrar é o primeiro a sair
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Um pequeno principe");
		livros.push("Donquixote");
		livros.push("hobbit");
		
		System.out.println(livros.peek());
		
		System.out.println(livros.poll());
		
		System.out.println(livros.pop());
		
		livros.clear(); // para limpar
		
		
	}
	
}
