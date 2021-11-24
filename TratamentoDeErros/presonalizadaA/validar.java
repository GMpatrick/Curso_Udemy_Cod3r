package TratamentoDeErros.presonalizadaA;

public class validar {
	private validar() {}
	
	public static void Produto(Produto p) {
		if (p == null) {
			
			// lançando uma exceção
			throw new IllegalArgumentException("O aluno esta nulo");
			
		}
		// verificar se esta vazio
		if (p.nome == null || p.nome.trim().isEmpty()) {
			throw new NumeroNegativoException("Nome");
		}
		
		if (p.preco < 0 || p.preco > 100) {
			throw new NumeroNegativoException2("Nota");
		}
	}
}
