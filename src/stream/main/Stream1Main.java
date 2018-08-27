package stream.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class Stream1Main {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Stream<Integer> numStream = numeros.stream();
		
		int soma = numStream
				.filter(n -> n % 2 == 1)
				.map(n -> n *n )
				.reduce(0, Integer::sum);
		System.out.println("soma: "+soma);

	}

}
