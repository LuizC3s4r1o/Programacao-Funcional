package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class BiConsumerMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Luiz", "Brazil");
		map.put("Rachel", "USA");
		map.put("Paul", "Canada");
		map.put("Maisse", "França");
		map.put("Toshio", "Japão");
		
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		
		System.out.println("Imprimindo da forma convencional -------------------- \n");
		if(it != null) {
			while(it.hasNext()) {
				Map.Entry<String, String> entrada = it.next();
				System.out.println("Chave: "+entrada.getKey()+ "\tValor: "+entrada.getValue());
			}
		}
		
		System.out.println("\nImprimindo com lambda e BiConsumer -------------------- \n");
		map.forEach((chave, valor) -> {System.out.println("Chave: "+chave+ "\tValor: "+valor);});
		
	}
	
	

	
}
