package TratamentoDeErros;

import oo.composicaoo.Compra;

public class Basico {
	
	public static void main(String[] args) {
		
		// exceção de forma generica
		try {
			System.out.println(7/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu o erro: "+e);
		}
		
		// exceção de forma mais especifica
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // printStac... em que ponto essa exceção foi lançada
		}
		
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+e.getLocalizedMessage()); // printStac... em que ponto essa exceção foi lançada
		}
		
		System.out.println("Fim");
	}
	
//	public static void impimirAluno(Compra compra) {
//		System.out.println(compra.cliente);
//	
//	}
	
}
