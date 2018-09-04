package operacoesFilter.main;

import java.util.List;

import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class OperacoesFilterMain {

	public static void main(String[] args) {
		
		List<Empregado> empregados = Empregado.empregados();
		
		System.out.println("Empregados HOMEM ----------------------------------");
		empregados.stream().filter(e -> e.isHomem()).forEach(e -> System.out.println("Nome: "+e.getNome()+ "\tGenero: "+e.getGenero()));
	}
	
}
