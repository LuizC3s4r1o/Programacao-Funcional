package stream.main;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import stream.entities.Estudante;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class Stream2Main {
	
	public static void main(String[] args) {
		
		Stream<String> str1 = Stream.of("Engenharia de Software");
		str1.forEach(System.out::println);
		System.out.println("");
		
		Stream<String> str2 = Stream.of("Engenharia de Software", "Medicina", "Engenharia de Produção", "Arquitetura");
		str2.forEach(System.out::println);
		System.out.println("");
		
		String[] arrayS = {"Java", "Phyton", "C#", "Ruby", "JavaScript"};
		Stream<String> str3 = Stream.of(arrayS);
		str3.forEach(System.out::println);
		System.out.println("");
		
		Stream<Estudante> strEstudante = Stream.<Estudante>builder()
				.add(new Estudante("1001",17,1.87,9.5))
				.add(new Estudante("1002",19,1.65,9.3))
				.add(new Estudante("1003",22,1.75,9.7))
				.build();
		strEstudante.forEach(estudante -> System.out.println(estudante.getAltura()));
		System.out.println("");
		
		//imprime de 0-9
		IntStream intStr = IntStream.range(0, 10);
		intStr.forEach(System.out::println);
		System.out.println("");
		
		//imprime de 0-10
		IntStream intStr2 = IntStream.rangeClosed(0, 10);
		intStr2.forEach(System.out::println);
		System.out.println("");
		
	}

}
