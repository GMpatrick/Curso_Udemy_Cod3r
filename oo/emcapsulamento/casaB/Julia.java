package oo.emcapsulamento.casaB;

import oo.emcapsulamento.casaA.Ana;

public class Julia {
	void testeAcessos() {
		Ana sogra = new Ana();
		
		System.out.println(sogra.segredo); // segredo é provate por isso não pode ser acessado
		System.out.println(sogra.facoDentroDeCassa);
		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
