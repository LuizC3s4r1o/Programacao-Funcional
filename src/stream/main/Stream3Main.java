package stream.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import stream.entities.Estudante;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class Stream3Main {
	
	public static void main(String[] args) {
		
		IntStream num = Arrays.stream(new int[] {2,8,12,9,25});
		num.forEach(System.out::println);
		System.out.println("");
		
		Stream<String> nomes = Arrays.stream(new String[] {"Luiz","Gabi","Paulo","Joel","Janaina"});
		nomes.forEach(System.out::println);
		System.out.println("");
		
		Set<String> linguagens = new HashSet<>();
		linguagens.add("java");
		linguagens.add("C++");
		linguagens.add("C#");
		linguagens.add("Phyton");
		
		Stream<String> liguagensStream = linguagens.stream();
		liguagensStream.forEach(System.out::println);
		System.out.println("");
		
		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(new Estudante("Luiz",35,25.5,25));
		estudantes.add(new Estudante("Maria",25,18.3,40));
		estudantes.add(new Estudante("Jose",45,37.2,10));
		estudantes.add(new Estudante("Regina",32,15,42));
		estudantes.add(new Estudante("Rose",27,19,18));
		estudantes.add(new Estudante("Laila",21,21,22));
		estudantes.add(new Estudante("Lucas",30,11,74));
		
		Stream<Estudante> estudantesStream = estudantes.parallelStream();
		estudantesStream.forEach(e -> System.out.println(e.getIdenditificacao()));
		System.out.println("");
		
	}

}
