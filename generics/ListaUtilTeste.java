package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		
		//CaixaInt t = new CaixaInt();
		
		List<String> langs = Arrays.asList("JS","JAVA","PYTHON","PHP");
		List<Number> nums = Arrays.asList(1,2,3,4,5,6);
		//List<?> qualquecoisa = Arrays.asList("palavra",10,5,"opa",t.toString());
		
		String ultimaLing = (String) ListaUtil.getUltimo1(langs);
		int ultimoNum = (Integer) ListaUtil.getUltimo1(nums);
		
		System.out.println("Ultimo numero: "+ ultimoNum+
				"\nUltima linguagem de programação: "+ultimaLing);
	
		String ultimaLing2 =  ListaUtil.getUltimo2(langs);
		Integer ultimoNum2 = (Integer) ListaUtil.getUltimo2(nums);
		
		System.out.println("Ultimo numero: "+ ultimoNum2+
				"\nUltima linguagem de programação: "+ultimaLing2);
	
	}
}
