package classes;

import entities.Paciente;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class ServirComparacoes {
	
	public int compararPorNome(Paciente p1, Paciente p2) {
		return p1.getNome().compareTo(p2.getNome());
	}
	
	public int compararPorIdade(Paciente p1, Paciente p2) {
		return p1.getIdade().compareTo(p2.getIdade());
	}
	
	

}
