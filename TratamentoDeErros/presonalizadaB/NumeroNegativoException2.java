package TratamentoDeErros.presonalizadaB;

@SuppressWarnings("serial") 
public class NumeroNegativoException2 extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public  NumeroNegativoException2(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	

	public String getMessage() {
		return "O atributo "+nomeDoAtributo+"Esta vazio";
	}
}
