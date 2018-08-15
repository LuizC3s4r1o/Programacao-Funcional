package main;
import interfaces.CalculadoraBigDecimal;
import interfaces.CalculadoraDouble;
import interfaces.CalculadoraInt;
import interfaces.CalculadoraLong;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class LambdaComAmbiguidade {

	public static void main(String[] args) {
	
		//formas de invocar o método contornando a ambiguidade
		engine((Long x,Long y) -> x + y);
		engine((CalculadoraInt)(x,y) -> x - y);
		engine((double x,double y) -> x / y);
		engine((CalculadoraBigDecimal)(x,y) -> x.multiply(y));
		
	}
	
	private static void engine(CalculadoraInt cal) {
		
	}
	
	private static void engine(CalculadoraLong cal) {
		
	}
	
	private static void engine(CalculadoraDouble cal) {
		
	}
	
	private static void engine(CalculadoraBigDecimal cal) {
		
	}

}
