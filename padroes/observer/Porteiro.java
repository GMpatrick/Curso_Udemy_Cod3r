package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ChegadaAniversarianteObservador> observadores = new ArrayList<ChegadaAniversarianteObservador>();
	
	/*
	 * Essa classe vai receber alguem que implementa um observador*/
	public void registrarObservador(ChegadaAniversarianteObservador observador) {

		observadores.add(observador);
	}
	
	/*
	 * Iniciar o monitoramento pelo porteiro*/
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();
			if ("sim".equalsIgnoreCase(valor)) {
				// criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				// notificar os observadores
				for (ChegadaAniversarianteObservador observados : observadores) {
					observados.chegou(evento); //aqui eu passo o evento que aconteceu
				}
			}else {
				System.out.println("Alarme falso");
			}
		}
		entrada.close();
	}
}
