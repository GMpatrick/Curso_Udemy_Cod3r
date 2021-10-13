package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// tipos numericos inteiros
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 568;
		int id = 56789;
		long pontosAcumulados = 323484522223L;
		
		// tipos numericos reais
		
		float salario = 11445.44F;
		double vendasAcumuladas = 1525144545412D;
		
		// tipo booleano
		boolean estaDeFerias = false;
		char status = '1';
		
		System.out.println(anosDeEmpresa * 365); // dias de empresa
		System.out.println(numerosDeVoos / 2); //numero de viagens
		System.out.println(pontosAcumulados / vendasAcumuladas); // pontos por viagem
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? "+estaDeFerias);
		System.out.println("Status: "+status);
	}
}
