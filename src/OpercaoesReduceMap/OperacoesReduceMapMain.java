package OpercaoesReduceMap;

import java.util.Map;
import java.util.stream.Collectors;

import operacoesFilter.entities.Empregado;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class OperacoesReduceMapMain {

	public static void main(String[] args) {
		
		System.out.println("Map de Id e Nome -------------------------------");
		Map<Long, String> mapIdNome = Empregado.empregados().stream().collect(Collectors.toMap(Empregado::getId, Empregado::getNome));
		
		System.out.println(mapIdNome+"\n");
		
		System.out.println("Map de Genero e Nome com BiOperato--------------");
		Map<Empregado.Genero, String> mapGeneroNome = Empregado.empregados().stream()
				.collect(Collectors.toMap(Empregado::getGenero, Empregado::getNome, (nome1, nome2) -> String.join(", ", nome1, nome2)));
		
		System.out.println(mapGeneroNome+"\n");

	}

}
