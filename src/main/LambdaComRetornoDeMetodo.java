package main;
import java.math.BigDecimal;

import interfaces.CalculadoraBigDecimal;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class LambdaComRetornoDeMetodo {

	public static void main(String[] args) {
	
		System.out.println("resultado : "+ criar().calcular(BigDecimal.TEN, BigDecimal.valueOf(5)));
		
	}
	
	private static CalculadoraBigDecimal criar() {
		
		return (x,y) -> x.divide(y);
	}

}
