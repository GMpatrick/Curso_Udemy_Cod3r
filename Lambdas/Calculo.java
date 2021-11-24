package Lambdas;

@FunctionalInterface // quando eu defino isso eu s� posso implementat um unico metodo abstrato
public interface Calculo {
	
	 double executar(double a, double b); // m�todo abstrato
	 
	 default String legal() { // m�todo padr�o
		 return "legal";
	 }
	 
	 static String muitoLegal() { // static
		 	return "legal demais";
	 }
		
}
