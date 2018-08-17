package main;

import java.util.Arrays;
import java.util.List;
import classes.CalculadoraBiFunction2;
import entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class BiFunctionMain2 {

	public static void main(String[] args) {

		List<Empregado> empregadoLista = Arrays.asList(new Empregado("Luiz", 2325.25), new Empregado("Gabi", 1852.15),
				new Empregado("Keke", 3216.05), new Empregado("Carla", 1953.32), new Empregado("Ruth", 2653.74),
				new Empregado("Jonh", 1953.11), new Empregado("George", 2454.25), new Empregado("Renata", 1125.50),
				new Empregado("Rose", 3025.02), new Empregado("Sofia", 1955.17));

		CalculadoraBiFunction2 calculadoraBiFunction2 = new CalculadoraBiFunction2();

		//lança 16% de incremento a cada salario
		List<Double> salarios = calculadoraBiFunction2.calc((salario, incremento) -> salario +(salario * (incremento / 100)),
				empregadoLista, 16.0);

		salarios.forEach(s -> System.out.printf("Salario: "+"%.2f%n", s.doubleValue()));
	}
}
