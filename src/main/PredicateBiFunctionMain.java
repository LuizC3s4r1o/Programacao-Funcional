package main;

import java.util.Arrays;
import java.util.List;

import classes.AnalisePredicate;
import classes.FuncoesPredicateBiFunction;
import entities.Funcionario;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class PredicateBiFunctionMain {

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
		
		System.out.println("Funcionarios com idade menor que 25 anos ----------------");
		List<Funcionario> funcJovens = analisePredicate.avaliar(listaFuncionarios, funcionario -> funcionario.getIdade() < 25);
		
		FuncoesPredicateBiFunction funcoesPredicateBiFunction = new FuncoesPredicateBiFunction();
		
		funcJovens.forEach(x-> { double novoSalario = funcoesPredicateBiFunction.incremetarSalario(x, 15, 
										(salario, incremento) -> salario + (salario * incremento/100));
				x.setSalario(novoSalario);
			});
		
		System.out.println("Funcionarios com salarios atualizados ----------------");
		funcJovens.forEach(f -> System.out.println("Nome: "+f.getNome()+": salario:"+ f.getSalario()));
		System.out.println("");
		
		System.out.println("Funcionarios com idade maior que 25 anos ----------------");
		funcJovens = analisePredicate.avaliarContrario(listaFuncionarios, funcionario -> funcionario.getIdade() < 25);
		funcJovens.forEach(x-> System.out.println("Nome: "+x.getNome()+" Idade: "+x.getIdade()));
		
	}
	
	

	
}
