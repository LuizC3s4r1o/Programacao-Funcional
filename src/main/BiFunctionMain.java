package main;

import java.util.function.BiFunction;

import classes.CalculadoraBiFunction;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class BiFunctionMain {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> bf = (x,y) -> x + y;
		
		System.out.println(bf.apply("Ola ", "mundo!"));
	
		
		CalculadoraBiFunction calculadoraBiFunction = new CalculadoraBiFunction();
		
		String resultado = calculadoraBiFunction.calc((x,y) -> "" + (x * y), 40, 10);
		
		System.out.println("Resultado: "+resultado);
		System.out.println("Resultado: "+resultado.length());
		System.out.println("Resultado: "+resultado.replace(resultado, "500"));
	}
	
	

	
}
