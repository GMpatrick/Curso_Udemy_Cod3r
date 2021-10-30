package fundamentos;

public class SwitchSemBreack {
	public static void main(String[] args) {
		String faixa = "marrom";
		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o tekkai shodan");
		case "roxa":
			System.out.println("Sei o godan");
		default:
			System.out.println("Não sei nada");
		}
	}
}
