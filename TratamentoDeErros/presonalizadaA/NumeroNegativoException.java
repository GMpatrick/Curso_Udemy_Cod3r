package TratamentoDeErros.presonalizadaA;

@SuppressWarnings("serial") 
public class NumeroNegativoException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public  NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return "O atributo "+nomeDoAtributo+"Esta vazio";
	}
}
