package main;

import java.util.function.BinaryOperator;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class BinaryOperatorMain {

	public static void main(String[] args) {

		BinaryOperator<Integer> byOperator = (n1, n2) -> n1 * n2;

		// Uso do método apply
		int resultado = byOperator.apply(10, 30);
		System.out.println("Resultado: " + resultado);

		// Uso do métofo minBy
		BinaryOperator<Integer> byOperatorMin = BinaryOperator.minBy((Integer i1, Integer i2) -> i1.compareTo(i2));
		resultado = byOperatorMin.apply(10, 30);
		System.out.println("Resultado min: " + resultado);

		// Uso do métofo maxBy
		BinaryOperator<Integer> byOperatorMax = BinaryOperator.maxBy((Integer i1, Integer i2) -> i1.compareTo(i2));
		resultado = byOperatorMax.apply(10, 30);
		System.out.println("Resultado max: " + resultado);

	}
}

