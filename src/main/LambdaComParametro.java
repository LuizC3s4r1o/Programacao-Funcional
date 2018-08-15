package main;
import interfaces.Operacoes;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class LambdaComParametro {

	public static void main(String[] args) {
		Operacoes op = (val1, val2) -> System.out.println("Soma: " + (val1 + val2));
		
		op.imprimirOpercao(10, 15);
		
		LambdaComParametro lcp = new LambdaComParametro();
		
		//implentação particular da função
		lcp.metodoInterno((val1,val2) -> System.out.println("Operacao particular: "+(val1 * val2)), 45, 15);
	}
	
	public void metodoInterno(Operacoes op, int val1, int val2) {
		op.imprimirOpercao(val1, val2);
	}

}
