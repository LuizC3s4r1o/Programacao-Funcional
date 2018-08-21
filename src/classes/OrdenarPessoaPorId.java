package classes;

import java.util.Comparator;

import entities.Pessoa;
/**
 * 
 * @author Luiz.Cesario
 *
 */

public class OrdenarPessoaPorId implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return p1.getId() - p2.getId();
	}
}
