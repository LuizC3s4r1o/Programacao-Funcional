package OperacoesReduce;

import java.util.List;
import java.util.stream.IntStream;

import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class OperacoesReduceMain {
	
	public static void main(String[] args) {
		
		int [] numeros = {1,3,5,6,8,10,7,12,9,6,3,7,18,22,18,21,26,33, 66,85,99,45,78,54,58,35,88};
		
		List<Empregado> empregados = Empregado.empregados();
		
		// Operacoes de redução com números - Soma
		System.out.println("Soma: \t\t" + IntStream.of(numeros).sum());

		// Operacoes de redução com números - Média
		System.out.println("Média:\t\t" + IntStream.of(numeros).average().getAsDouble());

		// Operacoes de redução com números - Máximo
		System.out.println("Máximo: \t" + IntStream.of(numeros).max().getAsInt());

		// Operacoes de redução com números - Mínimo
		System.out.println("Mínimo: \t" + IntStream.of(numeros).min().getAsInt());

		// Operacoes de redução com números - Quantidade de elementos
		System.out.println("Quantidade: \t" + IntStream.of(numeros).count());

		System.out.println("");
		// Operacoes de redução com empregados - Soma
		System.out.println("Soma salario empregados: \t" + empregados.stream().mapToDouble(Empregado::getSalario).sum());

		// Operacoes de redução com empregados - Média
		System.out.println("Média salário empregados:\t"
				+ empregados.stream().mapToDouble(Empregado::getSalario).average().getAsDouble());

		// Operacoes de redução com empregados - Máximo
		Empregado empMax = empregados.stream().max((e1, e2) -> (int) (e1.getSalario() - e2.getSalario())).get();
		System.out.println("Máximo salário empregados:---------------  \n" + empMax.getNome() + "\t salario: \t"
				+ empMax.getSalario());

		// Operacoes de redução com empregados - Mínimo
		Empregado empMin = empregados.stream().min((e1, e2) -> (int) (e1.getSalario() - e2.getSalario())).get();
		System.out.println("Mínimo salário empregados---------------- \n" + empMin.getNome() + "\t salario: \t"
				+ empMin.getSalario());

		// Operacoes de redução com empregados - Quantidade de elementos
		System.out.println("Quantidade empregados\t\t" + empregados.stream().mapToDouble(Empregado::getId).count());
		
	}

}
