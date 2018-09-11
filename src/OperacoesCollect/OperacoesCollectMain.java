package OperacoesCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class OperacoesCollectMain {
	
	public static void main(String[] args) {
		
		System.out.println("Usando ArrayList::new-------------------------------------------------");
		Empregado.empregados().stream().map(Empregado::getNome)
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll).forEach(System.out::println);

		List<String> listaEmpregados = Empregado.empregados().stream().map(Empregado::getNome).collect(ArrayList::new,
				ArrayList::add, ArrayList::addAll);

		System.out.println("\n" + listaEmpregados);

		System.out.println("\nUsando Collectors.toList--------------------------------------------");
		Empregado.empregados().stream().map(Empregado::getNome).collect(Collectors.toList())
				.forEach(System.out::println);

		List<String> listaEmpregados2 = Empregado.empregados().stream().map(Empregado::getNome)
				.collect(Collectors.toList());

		System.out.println("\n" + listaEmpregados2);

		System.out.println("\nUsando Set - sem elementos repetidos--------------------------------");
		Empregado.empregados().stream().map(Empregado::getNome).collect(Collectors.toSet())
				.forEach(System.out::println);

		Set<String> listaEmpregados3 = Empregado.empregados().stream().map(Empregado::getNome)
				.collect(Collectors.toSet());

		System.out.println("\n" + listaEmpregados3);

		System.out.println("\nUsando TreeSet - para ordenação------------------------------------");
		Empregado.empregados().stream().map(Empregado::getNome).collect(Collectors.toCollection(TreeSet::new))
				.forEach(System.out::println);

		SortedSet<String> listaEmpregados4 = Empregado.empregados().stream().map(Empregado::getNome)
				.collect(Collectors.toCollection(TreeSet::new));

		System.out.println("\n" + listaEmpregados4);
		
		
	}

}
