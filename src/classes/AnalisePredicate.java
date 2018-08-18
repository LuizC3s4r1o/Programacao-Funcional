package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Funcionario;
/**
 * 
 * @author Luiz.Cesario
 *
 */

public class AnalisePredicate {
	
	public List<Funcionario> avaliar(List<Funcionario> listFunc, Predicate<Funcionario> predFunc){
		
		List<Funcionario> listaFuncLocal = new ArrayList<>();
		listFunc.forEach(x -> {
			if (predFunc.test(x)) {
				listaFuncLocal.add(x);
			}
		});
		
		return listaFuncLocal;
	}
	
	public List<Funcionario> avaliarContrario(List<Funcionario> listFunc, Predicate<Funcionario> predFunc){
		
		List<Funcionario> listaFuncLocal = new ArrayList<>();
		listFunc.forEach(x -> {
			// o negate é o inevrso do determinado em predFunc
			if (predFunc.negate().test(x)) {
				listaFuncLocal.add(x);
			}
		});
		
		return listaFuncLocal;
	}

}
