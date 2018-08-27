package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import classes.ServirComparacoes;
import entities.Paciente;

/**
 * Método referenciado a método statico
 * 
 * @author Luiz.Cesario
 *
 */

public class MetodoReferenciadoMain {

	public static void main(String[] args) {

		List<Paciente> pacientes = Arrays.asList(
			new Paciente("Joaquim", 45, "joaquim@email.com.br"),
			new Paciente("Mario", 26, "mario@email.com.br"),	
			new Paciente("Keila", 35, "keila@email.com.br"),	
			new Paciente("Cinthia", 30, "cinthia@email.com.br"),	
			new Paciente("Gabriela", 29, "gabriela@email.com"),	
			new Paciente("Luiz", 37, "luiz@email.com.br"),	
			new Paciente("Roger", 31, "roger@email.com"),	
			new Paciente("Zuleide", 52, "zuleide@email.com"),	
			new Paciente("Adão", 45, "adao@email.com.br"),	
			new Paciente("Michella", 33, "michella@email.com")	
		);
		
		System.out.println("Pessoas sem ordenação -----------------------------\n");
		pacientes.forEach(p -> System.out.println(p));
		
		// chamada direta de ordenacao
		Collections.sort(pacientes, (p1,p2) -> p1.getIdade().compareTo(p2.getIdade()));
		System.out.println("\nPessoas com ordenação -----------------------------\n");
		pacientes.forEach(p -> System.out.println(p));
		
		// referenciando ao método static compararPorIdade da entidade Paciente
		Collections.sort(pacientes, (p1,p2) -> Paciente.compararPorIdade(p1, p2));
		System.out.println("\nReferenciando ao método da entidade Paciente -----------------------------\n");
		pacientes.forEach(p -> System.out.println(p));
		
		// referenciando ao método static compararPorIdade da entidade Paciente usando duas vezes o operados dois pontos
		Collections.sort(pacientes, Paciente::compararPorIdade);
		System.out.println("\nReferenciando ao método da entidade Paciente usando duas vezes o operados dois pontos\n");
		pacientes.forEach(p -> System.out.println(p));
		
		// revertendo a lista
		Collections.reverse(pacientes);
		System.out.println("\nRevertendo a lista Paciente -----------------------------\n");
		pacientes.forEach(p -> System.out.println(p));

		// Referencia por metodo de uma instância de objeto
		ServirComparacoes servirComparacoes = new ServirComparacoes();

		System.out.println("\nReferencia por metodo de uma instância de objeto -----------------------------\n");
		Collections.sort(pacientes, (p1, p2) -> servirComparacoes.compararPorNome(p1, p2));
		pacientes.forEach(p -> System.out.println(p));
		
		System.out.println("\nReferencia por metodo de uma instância de objeto 2----------------------------\n");
		Collections.sort(pacientes, servirComparacoes::compararPorIdade);
		pacientes.forEach(System.out::println);
		
		// Referencia por metodo de uma instância de objeto arbitrario de um tipo particular
		System.out.println("\nReferencia por metodo de uma instância de objeto arbitrario de um tipo particular\n");
		Collections.sort(pacientes, (p1, p2) -> p1.compararPorIdade2(p2));
		pacientes.forEach(System.out::println);
		
		System.out.println("\nReferencia por metodo de uma instância de objeto arbitrario de um tipo particular 2\n");
		Collections.sort(pacientes, Paciente::compararPorIdade2);
		pacientes.forEach(System.out::println);
		
	}

}
