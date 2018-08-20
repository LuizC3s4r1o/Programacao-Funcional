package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import classes.AnaliseBiPredicate;
import entities.Funcionario;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class BiPredicateMain {

	public static void main(String[] args) {
		
		List<Funcionario> listaFuncionarios = Arrays.asList( 
					new Funcionario("Luiz", 37, 1215.25, "Engenharia"),
					new Funcionario("Renato", 21, 3250.52, "TI"),
					new Funcionario("Raquel", 35, 2453.85, "Vendas"),
					new Funcionario("Ruth", 28, 1215.25, "Adm"),
					new Funcionario("Oscar", 31, 1852.75, "Engenharia"),
					new Funcionario("Patricia", 42, 5000.25, "Vendas"),
					new Funcionario("Roberta", 39, 4200.45, "Compras"),
					new Funcionario("Gabriel", 44, 3225.14, "Produção"),
					new Funcionario("Robson", 18, 1898.59, "Compras"),
					new Funcionario("marcos", 24, 2316.77, "Adm"),
					new Funcionario("Andre", 26, 1852.75, "Engenharia"),
					new Funcionario("Rose", 32, 5000.25, "Vendas"),
					new Funcionario("Faber", 31, 4200.45, "Compras"),
					new Funcionario("Fernando", 57, 3225.14, "Produção"),
					new Funcionario("Clauss", 23, 1898.59, "Compras"),
					new Funcionario("Fernanda", 45, 2316.77, "Adm")
				);
		
		AnaliseBiPredicate analiseBiPredicate = new AnaliseBiPredicate();
		
		BiPredicate<Integer, String> criterio1 = (idade, departamento) -> (idade >= 25) && (departamento.equals("Vendas"));
		BiPredicate<Integer, String> criterio2 = (idade, departamento) -> (idade >= 25) && (departamento.equals("Adm"));
		BiPredicate<Integer, String> criterio = criterio1.or(criterio2);

		
		System.out.println("Funcionarios acima de 25 do departamento de Vendas ou Adm -------- \n");
		List<Funcionario> listaAtualizada = analiseBiPredicate.avaliar(listaFuncionarios, criterio);
		listaAtualizada.forEach(x-> System.out.println("Nome: "+x.getNome()+" - Idade: "+x.getIdade()+" - Departamento: "+x.getDepartamento()));
		
	}
	
}
