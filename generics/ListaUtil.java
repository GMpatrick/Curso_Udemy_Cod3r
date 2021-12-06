package generics;

import java.util.List;

public class ListaUtil {
	
	// <?> "Essa lista pode ser de qualquel coisa"
	// a função vai retornar o ultimo item de cada lista
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1);// pegar o ultimo elemento de uma lista;
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() -1);// pegar o ultimo elemento de uma lista;
	}
}
