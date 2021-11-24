package StreamApi;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	// formas diferentes de criar Streams
	public static void main(String[] args) {
		// interface funcional que recebe um parametro e não retorna nada
		Consumer<String> print = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "Lua", "Js");
		langs.forEach(print);
		
		// Stream de dados é uma lisat sequencia array... etc
	}
}
