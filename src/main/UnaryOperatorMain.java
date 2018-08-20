package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class UnaryOperatorMain {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		Integer ajuste = 5;

		List<Integer> listaActual = operadorUnary(num -> num * ajuste, lista);

		listaActual.forEach(x -> System.out.println("num: " + x));
	}

	public static List<Integer> operadorUnary(UnaryOperator<Integer> unaryOp, List<Integer> lista) {

		List<Integer> listaAtualizada = new ArrayList<>();

		lista.forEach(num -> listaAtualizada.add(unaryOp.apply(num)));

		return listaAtualizada;
	}
}
