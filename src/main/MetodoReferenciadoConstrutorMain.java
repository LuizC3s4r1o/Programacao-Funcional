package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/**
 * Método referenciado de um construtor
 * 
 * @author Luiz.Cesario
 *
 */

public class MetodoReferenciadoConstrutorMain {

	public static void main(String[] args) {

		List<String> numStrings = Arrays.asList("1","10","7","15","20","8","33","18","45","37","54","71");
		
		getResultados(numStrings, Integer::new).forEach(n -> System.out.println("nx10: "+n * 10));
		System.out.println("");
		
		getResultados(numStrings, Integer::new).forEach(num -> MetodoReferenciadoConstrutorMain.multiplicarPor5(num));
		System.out.println("");
		
		getResultados(numStrings, Integer::new).forEach(MetodoReferenciadoConstrutorMain::multiplicarPor5);
		
	}
	
	
		public static List<Integer> getResultados(List<String> listaString, Function<String, Integer> func){
			
			List<Integer> resultado = new ArrayList<>();
			listaString.forEach(stringParaNumero -> resultado.add(func.apply(stringParaNumero)));
			return resultado;
		}
		
		public static void multiplicarPor5(int num) {
			System.out.println("num original: "+ num +" num x 5: "+ num * 5);
		}
		
	

}
