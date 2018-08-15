package main;
import interfaces.Function;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class LambdaSemParametro {

	public static void main(String[] args) {
		Function f = () -> System.out.println("Ola");
		
		f.saudacao();
		
		LambdaSemParametro p = new LambdaSemParametro();
		
		p.metodoInterno(f);
	}
	
	public void metodoInterno(Function f) {
		f.saudacao();
	}

}
