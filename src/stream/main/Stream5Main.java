package stream.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 
 * @author Luiz.Cesario
 *
 */
public class Stream5Main {
	
	public static void main(String[] args) {
		
		Path path1 = Paths.get("texto.txt");
		
		try (Stream<String> linhas = Files.lines(path1) ) {
			linhas.forEach(linha ->{
				System.out.println("Linha.........");
				System.out.println(linha);
			});
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		Path dir = Paths.get(".");
		System.out.printf("%nO caminho do projeto para: %s e %n ", dir.toAbsolutePath());
		
		try (Stream<Path> paths = Files.walk(dir) ) {
			paths.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
