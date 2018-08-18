package classes;

import java.util.function.BiFunction;
import entities.Funcionario;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class FuncoesPredicateBiFunction {
	
		public Double incremetarSalario(Funcionario func, double incremento, BiFunction<Double, Double, Double> bf) {
			
			return bf.apply(func.getSalario(), incremento);
			
			}

}
