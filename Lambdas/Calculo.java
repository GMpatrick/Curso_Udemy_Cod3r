package Lambdas;

@FunctionalInterface // quando eu defino isso eu só posso implementat um unico metodo abstrato
public interface Calculo {
	
	 double executar(double a, double b); // método abstrato
	 
	 default String legal() { // método padrão
		 return "legal";
	 }
	 
	 static String muitoLegal() { // static
		 	return "legal demais";
	 }
		
}
