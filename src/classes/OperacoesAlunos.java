package classes;

import java.util.List;
import java.util.function.Consumer;
import entities.Alunos;
/**
 * 
 * @author Luiz.Cesario
 *
 */

public class OperacoesAlunos {
	
	public void aceitarTodos(List<Alunos> listAlunos, Consumer<Alunos> consAlunos) {
		
		listAlunos.forEach(x -> consAlunos.accept(x));
	}
	 
}
