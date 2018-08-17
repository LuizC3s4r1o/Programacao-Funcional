package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Luiz.Cesario
 *
 */

import java.util.function.BiFunction;

import entities.Empregado;

public class CalculadoraBiFunction2 {
	
	public List<Double> calc(BiFunction<Double, Double, Double> bif, List<Empregado> listaEmpregado, Double incremento) {
		
		List<Double> listaSalarios = new ArrayList<>();
		
		listaEmpregado.forEach(x -> listaSalarios.add(bif.apply(x.getSalario(), incremento)));
		
		return listaSalarios;
	}

}
