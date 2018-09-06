package OperacoesMap;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class OperacoesMapMain {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10)
				.map(new IntUnaryOperator() {
					
					@Override
					public int applyAsInt(int numero) {
						return numero * numero;
					}
				})
				.forEach(System.out::println);
		
		System.out.println("");
		IntStream.rangeClosed(1, 10)
			.map(n -> n * 2)
			.forEach(System.out::println);
		
		System.out.println("");
		List<Empregado> empregados = Empregado.empregados();
		
		System.out.println("Salario médio feminino maior que 25 anos");
		double soma = empregados.stream()
					.filter(Empregado::isMulher)
					.filter(e -> e.getIdade() > 25)
					.mapToDouble(e -> e.getSalario())
					.sum();
		
		double media = soma / empregados.stream()
							.filter(Empregado::isMulher)
							.filter(e -> e.getIdade() > 25)
							.count();
		
		System.out.println(media);

	}

}
