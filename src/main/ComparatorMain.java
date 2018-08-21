package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import classes.OrdenarPessoaPorId;
import entities.Pessoa;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class ComparatorMain {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1, "Raul", LocalDate.of(1960, 03, 12)));
		pessoas.add(new Pessoa(2, "Rita", LocalDate.of(1990, 07, 20)));
		pessoas.add(new Pessoa(3, "Laura", LocalDate.of(1985, 11, 01)));
		
		System.out.println("\nLista de pessoas sem ordenação ------------------");
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
		System.out.println("\nLista de pessoas com ordenação ------------------");
		System.out.println(pessoas);
		
//		uso de classe ordenadora
		Collections.sort(pessoas, new OrdenarPessoaPorId());
		System.out.println("\nLista de pessoas Ordenadas por Id ------------------");
		System.out.println(pessoas);
		
//		uso direto da classe abstrata
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p1.getDataNacimento().compareTo(p2.getDataNacimento());
			}
		});
		System.out.println("\nLista de pessoas Ordenadas por Data nascimento ------------------");
		System.out.println(pessoas);
		
//		uso direto do lambda e Interface Comparator
		Collections.sort(pessoas, (p1,p2) -> p1.getId() - p2.getId());
		System.out.println("\nLista de pessoas Ordenadas por Id usando lambda ------------------");
		System.out.println(pessoas);
		
}
	
	
}
