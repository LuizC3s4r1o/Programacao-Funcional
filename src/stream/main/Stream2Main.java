package stream.main;

import java.util.Random;
import java.util.stream.Stream;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class Stream2Main {
	
	public static void main(String[] args) {
		
		System.out.println("Interações zero-dez-----------------");
		Stream<Long> strLong = Stream.iterate(1L, l -> l +1)
				.limit(10);
				strLong.forEach(System.out::println);
				System.out.println("");
		
		System.out.println("\nDez Interações pares -----------------");
		Stream.iterate(1L, l -> l +1)
			.filter(l -> l % 2 == 0)
			.limit(10)
			.forEach(System.out::println);
		
		System.out.println("\nApós dez interações pares, mais cinco interações-----------------");
		Stream.iterate(1L, l -> l +1)
			.filter(l -> l % 2 == 0)
			.skip(10)
			.limit(5)
			.forEach(System.out::println);
		
		System.out.println("\nNúmeros aleatórios -----------------");
		Stream.generate(Math::random)
			.limit(5)
			.forEach(System.out::println);
			System.out.println("");
		
		System.out.println("\nNúmeros inteiros aleatórios -----------------");
		new Random().ints()
			.limit(5)
			.forEach(System.out::println);
			System.out.println("");
		
	}

}
