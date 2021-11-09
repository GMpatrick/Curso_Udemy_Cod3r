package ArrayColections;

import java.util.HashMap;
import java.util.Map.Entry;



public class Map {
	public static void main(String[] args) {
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); // modo de adicionar no map, ele adiciona se não existit e se existir ele substitui
		usuarios.put(1, "Ricardo");
		usuarios.put(3, "Rafaela");
		
		System.out.println(usuarios.keySet());
		
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("rebeca"));
		System.out.println(usuarios.get(20));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}
}
