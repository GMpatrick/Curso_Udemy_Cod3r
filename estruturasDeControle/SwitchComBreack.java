package fundamentos;

public class SwitchComBreack {
	public static void main(String[] args) {
		String conceito = "";
		
		int nota = 7;
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		 
		case 8: case 7:	
			conceito = "b";
			break;
			
		case 6: case 5:
			conceito = "c";
			break;
		default:
			conceito = "Conceito não ifnormado";
		}
	}
}
