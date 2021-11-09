package ArrayColections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
	public static void main(String[] args) {
		// o primeiro que entra � o primeiro que sai
		
		Queue<String> fila  = new LinkedList<String>();
		
		fila.add("Ana");
		fila.offer("Bia"); // tem filas com limita��es de tamanho e se caso voce eceder o tamanho ele retorna verdadeiro ou falso caso consiga adicionar
		fila.add("Marcos");
		fila.add("Daniel");
		fila.add("Guia");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// peek e element -> obter o proximo elemento da fila sem remover
		// peek retorna null
		// element lan�a uma exece��o
		
		
		System.out.println(fila.isEmpty()); // verificar se a fila esta vazia
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila ja removendo
		
		System.out.println(fila.remove());
		
		
		
	}
}
