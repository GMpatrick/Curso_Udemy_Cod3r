package ClassesMetodos;

public class AreaCirc {
	double raio;
	static final double PI = 3.1415; // quando eu declaro um atributo como statico faz com que o atrbuto penten�a a classe e n�o mais as instancias
	// eu n�o presciso criar uma instancia da classe datas para poder usar o pi
	
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
		
	}
	
	double area() {
		return raio * raio * PI;
	}
}
