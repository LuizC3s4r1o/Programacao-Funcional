package stream.main;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class Stream4Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		IntStream streamChars = entrada.chars();
		
		System.out.println("Imprime todos caracteres digitados desconsiderando números e espaços em branco");
		streamChars.filter(n -> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
		.forEach(n -> System.out.print((char)n));
		
		System.out.println();
		String str ="HTML, JAVA, PHYTON, C++, C#, CSS, JAVASCRIPT";
		Pattern.compile(", ").splitAsStream(str).forEach(System.out::println);
	}

}
