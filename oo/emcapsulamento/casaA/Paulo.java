package oo.emcapsulamento.casaA;

public class Paulo {
	void testeAcessos() {
		Ana esposa = new Ana();
		
		System.out.println(esposa.segredo); // segredo é provate por isso não pode ser acessado
		System.out.println(esposa.facoDentroDeCassa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
