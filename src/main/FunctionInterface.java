package main;

import java.util.function.Function;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer, String> converter = x -> Integer.toString(x);
		
		System.out.println(converter.apply(12).length());
		System.out.println(converter.apply(5).replaceAll("5", "cinco"));
	
		
	}
	
	
}
