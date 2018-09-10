package OperacoesReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class OperacoesReduce2Main {
	
	public static void main(String[] args) {
		
		int [] numeros = {1,3,5,6,8,10,7,12,9,6,3,7,18,22,18,21,26,33, 66,85,99,45,78,54,58,35,88};
		
		List<Empregado> empregados = Empregado.empregados();
		
		// Operacoes de redução com números - reduce Soma
		int soma = IntStream.of(numeros).reduce(0, (n1,n2) -> n1+n2);
		System.out.println("Soma: \t\t" +soma);
		
		// Operacoes de redução com números - reduce Soma (metodo referenciado)
		int somaRef = IntStream.of(numeros).reduce(0, Integer::sum);
		System.out.println("Somaref: \t" +somaRef);
				
		// Operacoes de redução com números - summaryStatistics)
		System.out.println("sumary: \t" +IntStream.of(numeros).summaryStatistics());
				
		// Operacoes de redução com números - summaryStatistics - soma)
		System.out.println("Soma: \t" +IntStream.of(numeros).summaryStatistics().getSum());
		
		// Operacoes de redução com números - summaryStatistics - média)
		System.out.println("Média: \t" +IntStream.of(numeros).summaryStatistics().getAverage());
		
		// Operacoes de redução com números - summaryStatistics - máximo)
		System.out.println("Máximo: \t" +IntStream.of(numeros).summaryStatistics().getMax());
		
		// Operacoes de redução com números - summaryStatistics - mínimo)
		System.out.println("Mínimo: \t" +IntStream.of(numeros).summaryStatistics().getMin());
		
		// Operacoes de redução com números - summaryStatistics - quantidade)
		System.out.println("Quantidade: \t" +IntStream.of(numeros).summaryStatistics().getCount());
		
		System.out.println("");
	
		// Operacoes de redução com empregados - summaryStatistics - Soma)
		System.out.println("Soma salario emp: \t" +empregados.stream().mapToDouble(Empregado::getSalario).summaryStatistics().getSum());
		
		// Operacoes de redução com empregados - summaryStatistics - média)
		System.out.println("Média salario emp: \t" +empregados.stream().mapToDouble(Empregado::getSalario).summaryStatistics().getAverage());
		
		// Operacoes de redução com empregados - summaryStatistics - máximo)
		System.out.println("Máximo salario emp: \t" +empregados.stream().mapToDouble(Empregado::getSalario).summaryStatistics().getMax());
		
		// Operacoes de redução com empregados - summaryStatistics - mínimo)
		System.out.println("Mínimo salario emp: \t" +empregados.stream().mapToDouble(Empregado::getSalario).summaryStatistics().getMin());
		
		// Operacoes de redução com empregados - summaryStatistics - quantidade)
		System.out.println("Quantidade: \t\t" +empregados.stream().mapToLong(Empregado::getId).summaryStatistics().getCount());
	}

}
