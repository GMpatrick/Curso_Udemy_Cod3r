package TratamentoDeErros;

public class ChecadaXnaoChecada {
	
	public static void main(String[] args) {
		try {
			geraErroUm();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()+e.getLocalizedMessage());
		}
		
		try {
			geraErroDois();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim :)");
	}
	
	//RuntimeException
	// é uma exceção não checada e não verificada, voce pode escolher se quer ou não tratar o erro
	static void geraErroUm() {
		throw new RuntimeException("Ocorreu um erro bem legal 01");
	
		// eu só posso lançar um erro quando eu coloco o throw 
		// caso eu não coloque não sera mostrado nada em tela
	}
	
	// execeção checada e verificada
	static void geraErroDois() throws Exception {
		throw new Exception("Ocorreu um erro bem legal 02");
		
//		try {
//			throw new Exception("Ocorreu um erro bem legal 02");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Que legal");
//		}
		
	}
}
