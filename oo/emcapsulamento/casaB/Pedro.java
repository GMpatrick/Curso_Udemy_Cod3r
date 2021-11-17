package oo.emcapsulamento.casaB;

import oo.emcapsulamento.casaA.Ana;

public class Pedro extends Ana{

		void testeAcesso() {
		
		System.out.println(segredo); // segredo é provate por isso não pode ser acessado
		System.out.println(facoDentroDeCassa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	}
}
