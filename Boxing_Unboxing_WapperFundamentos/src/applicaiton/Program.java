package applicaiton;

public class Program {

	public static void main(String[] args) {

		int x = 20;
		
		// boxing é o processo de conversão de um objeto tipo valor para um objeto tipo reverência.
		Object obj = x;
		
		System.out.println(obj);
		
		// unboxing é o processo de conversão de um objeto tipo reverência para um objeto tipo valor.
		int y = (int) obj * 2;
		
		System.out.println(y);

		//wapper classes são classes equivalentes aos tipos primitivos
		
		// boolean = Boolean
		// char = Character
		// byte = Byte 
		// short = Short
		// int = Integer
		// long = Long
		// float = Float
		// double = Double 
		
		int w = 20;
		Integer obj1 = w; // tratando tipos primitivos de forma transparente.
		
		int z = obj1 * 2;
		
		System.out.println(z);
		
	}

}
