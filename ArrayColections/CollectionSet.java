package ArrayColections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		// O set é um conjunto
		/*
		 * pode ser heterogeneo
		 * pode ser homogeneo
		 * não aceita objs duplicados
		 * pode ser ordenado
		 * não é indexado
		 */
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size()); // tamanho do conjunto
		
		conjunto.add("Teste"); // ele não vai add pois não aceita repetição
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		conjunto.addAll(nums); // adicionando tudo que tem em nums, união emtre dois conjuntos
		
		System.out.println(conjunto);
		
		conjunto.clear(); // para limpar
	}
		
}
