package oo.emcapsulamento.casaB;

import oo.emcapsulamento.casaA.Ana;

public class Pedro extends Ana{

		void testeAcesso() {
		
		System.out.println(segredo); // segredo � provate por isso n�o pode ser acessado
		System.out.println(facoDentroDeCassa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	}
}
