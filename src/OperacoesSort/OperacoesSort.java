package OperacoesSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class OperacoesSort {

	public static void main(String[] args) {
		System.out.println("Nomes ordenados");
		Arrays.asList("Luiz", "Ana", "Bruna", "Sofia")
					.stream().sorted().forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Números ordenados");
		Arrays.asList(1,5,6,8,10,4,3,9,7,2)
					.stream().sorted().forEach(System.out::println);
		
		System.out.println("");
		//Usando a implementação Comparable da entidade Empregado
		List<Empregado> empregados = Empregado.empregados();
		empregados.stream()
					.sorted()
					.forEach(e -> System.out.println("Nome:\t"+ e.getNome()));
		
		System.out.println("");
		System.out.println("Empregados ordenados por idade");
		//Usando a método abstrato Comparable 
		empregados.stream()
					.sorted(new Comparator<Empregado>() {
						@Override
						public int compare(Empregado e1, Empregado e2) {
							return e1.getIdade() - e2.getIdade();
						}
					})
					.forEach(e -> System.out.println("Nome:\t"+ e.getNome()+"\tIdade:\t"+e.getIdade()));
		
		System.out.println("");
		System.out.println("Empregados ordenados por salario com idade superior a 30 anos");
		empregados.stream()
					.filter(e -> e.getIdade() > 30)
					.sorted((x, y) -> (int)(x.getSalario() - y.getSalario()))
					.forEach(e -> System.out.println("Nome:\t"+ e.getNome()+"\tSalario:\t"+e.getSalario()+"\tIdade:\t"+e.getIdade()));	
	
		
	}

}
