package main;

import java.util.function.Supplier;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class SupplierMain {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> "Luiz";
		
		System.out.println("Valor: "+ s.get());
	}
}
