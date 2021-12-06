package padroes.observer;

import java.util.Date;

/*
 * Classe que registrara o evento
 * 
 * quando voce prescisa ter uma classe que registra m evento?
 * quando voce tem informações associadas ao evento
 * 
 * Essa classe seria como o exemplo do porteiro*/

public class EventoChegadaAniversariante {
	
	private final Date momento; // registrara a chegada do evento

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
	
	
}
