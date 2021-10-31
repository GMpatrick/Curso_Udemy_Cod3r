package ClassesMetodos;

public class ValorXReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a+ " "+b);
		
		Datas d1 = new Datas(1, 6, 2021);
		Datas d2 = d1; // atribuição por referencia pois estou trabalhando com objeto
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		d1.dataFormatada();
		d2.dataFormatada();
		
		voltarDataParaValorPadrao(d1);
		
		d1.dataFormatada();
		d2.dataFormatada();
		
		int c = 5;
		
		alterarPrimitico(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Datas d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitico (int a) {
		a++;
	}
	
}
