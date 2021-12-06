package padroes.observer;

public class AniversarioSupresa {
	
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		// aqui vai ser notficado ao observador
		porteiro.registrarObservador(namorada);
		
		porteiro.monitorar();
		
		
	}
}
