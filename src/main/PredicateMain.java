package main;

import java.util.Arrays;
import java.util.List;

import classes.AnalisePredicate;
import entities.Funcionario;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class PredicateMain {

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
					new Funcionario("marcos", 24, 2316.77, "Adm")
				);
		
		AnalisePredicate analisePredicate = new AnalisePredicate();
		
		System.out.println("Salarios acima de 3000 ----------------");
		List<Funcionario> funcSalarios = analisePredicate.avaliar(listaFuncionarios, funcionario -> funcionario.getSalario() > 3000);
		funcSalarios.forEach(x->System.out.println("Nome: "+x.getNome()+", salario: "+x.getSalario()));
		
		System.out.println("Funcionarios que inciam com a letra R ----------------");
		List<Funcionario> funcNomesComR = analisePredicate.avaliar(listaFuncionarios, funcionario -> funcionario.getNome().startsWith("R"));
		funcNomesComR.forEach(x->System.out.println("Nome: "+x.getNome()));
		
		System.out.println("Funcionarios com idade menor que 25 anos ----------------");
		List<Funcionario> funcJovens = analisePredicate.avaliar(listaFuncionarios, funcionario -> funcionario.getIdade() < 25);
		funcJovens.forEach(x-> System.out.println("Nome: "+x.getNome()+" Idade: "+x.getIdade()));
		
	}
	
	

	
}
