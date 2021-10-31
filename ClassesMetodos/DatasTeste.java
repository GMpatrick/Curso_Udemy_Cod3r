package ClassesMetodos;

public class DatasTeste {
	public static void main(String[] args) {
		
		Datas d1 = new Datas();
		
		d1.dia = 25;
		d1.mes = 03;
		d1.ano = 2021;
		
		System.out.println(d1.toString());
		
		d1.dataFormatada();
		
		Datas d2 = new Datas();
		
		System.out.println(d2.toString());
		
		Datas d3 = new Datas(10, 12, 1994);
		System.out.println(d3.toString());
		
		System.out.println(Datas.pi); // usando um método statico
		
	}
}
