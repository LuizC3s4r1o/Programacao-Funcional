package main;
import interfaces.Calculadora;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class LambdaComDevolucao {

	public static void main(String[] args) {
	
		engine((x,y) -> x + y);
		engine((x,y) -> x - y);
		engine((x,y) -> x / y);
		engine((x,y) -> x * y);
		engine((x,y) -> x % y);
		
	}
	
	private static void engine(Calculadora cal) {
		int x = 10,  y = 3;
		int resultado = cal.calular(x, y);
		System.out.println("Resultado: "+resultado);
	}

}
