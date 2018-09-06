package operacoesFilter.main;

import java.util.List;
import java.util.function.Predicate;

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
		
		System.out.println("");
		System.out.println("Empregados MULHER ----------------------------------");
		empregados.stream().filter(Empregado::isMulher).forEach(e -> System.out.println("Nome: "+e.getNome()+ "\tGenero: "+e.getGenero()));
		
		System.out.println("");
		System.out.println("Empregados maiores de 30 anos ----------------------");
		empregados.stream().filter(e -> e.getIdade() > 25).forEach(e -> System.out.println("Nome: "+e.getNome()+ "\tIdade: "+e.getIdade()));
		
		System.out.println("");
		System.out.println("Empregados HOMEM E primeira letra do nome seja R-----");
		empregados.stream().filter(Empregado::isHomem)
							.filter(x -> x.getNome().startsWith("R"))
							.forEach(e -> System.out.println("Nome: "+e.getNome()+ "\tIdade: "+e.getIdade()));
		
		System.out.println("");
		System.out.println("Empregados HOMEM com salario < 400 ------------------");
		empregados.stream().filter(e -> e.isHomem() && e.getSalario() < 400)
							.forEach(e -> System.out.println("Nome: "+e.getNome()+ "\tGenero: "+e.getGenero()+ "\tSalario: "+e.getSalario()));
		
		System.out.println("");
		System.out.println("Empregados MULHER maior de 25 anos com salario > 400 ");
		Predicate<Empregado> eMulher = e -> e.isMulher();
		Predicate<Empregado> eMaior25 = e -> e.getIdade() > 25;
		Predicate<Empregado> eMaior400 = e -> e.getSalario() > 400;
		Predicate<Empregado> resultado = eMulher.and(eMaior25).and(eMaior400);
		
		empregados.stream().filter(resultado)
							.forEach(e -> System.out.println("Genero: "+e.getGenero()+ "\tIdade: "+e.getIdade()+ "\tSalario: "+e.getSalario()));
		
		System.out.println("\nQuantidade total: "+empregados.stream().filter(resultado).count());
		
		
	}
	
}
