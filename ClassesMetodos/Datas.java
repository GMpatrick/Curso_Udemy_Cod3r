package ClassesMetodos;

import java.util.Date;

public class Datas {
	int dia;
	int mes;
	int ano;
	static double pi = 3.14; // quando eu declaro um atributo como statico faz com que o atrbuto pentença a classe e não mais as instancias
	// eu não presciso criar uma instancia da classe datas para poder usar o pi
	
	Datas () {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Datas(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	
	@Override
	public String toString() {
		return "dia=" + dia + ", mes=" + mes + ", ano=" + ano;
	}
	
	public void mostarDataSistema() {
		Date teste = new Date();
		System.out.println(teste);
	};
	
	public int teste(int a1, int a2) {
		int resultado = 0;
		resultado = a1 + a2;
		return resultado;
	}
	
	
	public void dataFormatada() {
		System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
	}
	
	
}
