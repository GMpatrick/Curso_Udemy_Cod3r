package padroes.observer;

/*
 * A namroada implementara a interface do observador
 * por que ela esta interessada em ser notificada 
 * quando o namorado chegar */

public class Namorada implements ChegadaAniversarianteObservador{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados");
		System.out.println("Apagar as luzes");
		System.out.println("esperar um pouco");
		System.out.println("Supresa");
	}
}
