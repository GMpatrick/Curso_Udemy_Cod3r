package StreamApi.DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioUm {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//marcas.stream().map(m -> m.toUpperCase()).forEach(print);;
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s,2);
			
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
		
	}
}
