package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import entities.Funcionario;
/**
 * 
 * @author Luiz.Cesario
 *
 */

public class AnaliseBiPredicate {
	
	public List<Funcionario> avaliar(List<Funcionario> listFunc, BiPredicate<Integer, String> biPredFunc){
		
		List<Funcionario> listaFuncLocal = new ArrayList<>();
		listFunc.forEach(x -> {
			if (biPredFunc.test(x.getIdade(), x.getDepartamento())) {
				listaFuncLocal.add(x);
			}
		});
		
		return listaFuncLocal;
	}
	
}
