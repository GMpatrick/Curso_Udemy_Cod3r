package generics;

public class Caixa<TIPO> {// <> � a anota��o do generics
	
	private TIPO coisa;
	
	public void aguardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir() {
		return coisa;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
}
