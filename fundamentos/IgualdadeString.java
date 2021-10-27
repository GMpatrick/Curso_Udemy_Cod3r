package fundamentos;

public class IgualdadeString {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s); // resultado vai ser falso
		System.out.println("2".equals(s)); // forma ceta de comparar strings
		
		
	}

}
