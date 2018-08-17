package classes;

import java.util.function.BiFunction;

public class CalculadoraBiFunction {
	
	public String calc(BiFunction<Integer, Integer, String> bif, Integer b1, Integer b2) {
		return bif.apply(b1, b2);
	}

}
