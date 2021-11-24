package TratamentoDeErros.presonalizadaB;

public class Testevalidacoes {
	
	public static void main(String[] args) {
		
		try {
			Produto p1 = new Produto(240, "");
			validar.Produto(p1);
		} catch (NumeroNegativoException e ) {
			// TODO Auto-generated catch block
			System.out.println("Estou aprendendo");
			System.out.println("Mas ainda deu o erro");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Estou aprendendo");
			System.out.println("Mas ainda deu o erro");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
