package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import classes.OperacoesAlunos;
import entities.Alunos;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class ConsumerMain {

	public static void main(String[] args) {
		
		List<Alunos> listaAlunos = Arrays.asList( 
					new Alunos("Luiz", 7),
					new Alunos("Laura", 9),
					new Alunos("Aline", 4),
					new Alunos("Clara", 5),
					new Alunos("Ricardo", 7),
					new Alunos("Rubens", 6.5),
					new Alunos("Marcio", 2),
					new Alunos("Mario", 8),
					new Alunos("Fernada", 7),
					new Alunos("Alex", 4),
					new Alunos("Leila", 3),
					new Alunos("Sofia", 6)
				);
		
		OperacoesAlunos operacoesAlunos = new OperacoesAlunos();
		Double ajuste = 1.35;
		
		Consumer<Alunos> cons1 = a -> System.out.printf("Nome: "+a.getNome()+", classificação: %.2f\n",a.getClassificacao());
		System.out.println("Lista de alunos  inicial ---------------- \n");
		operacoesAlunos.aceitarTodos(listaAlunos, cons1);
		
		Consumer<Alunos> cons2 = a -> a.setClassificacao(a.getClassificacao() * ajuste);

		Consumer<Alunos> cons3 = cons2.andThen(cons1);
		
		System.out.println("\nLista de alunos Atualizada---------------- \n");
		operacoesAlunos.aceitarTodos(listaAlunos, cons3);
		
	}
	
	

	
}
