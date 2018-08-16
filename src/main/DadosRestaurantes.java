package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import entities.Restaurante;

public class DadosRestaurantes {

	public static void main(String[] args) {
		
		List<Restaurante> listarestaurantes = Arrays.asList(
				new Restaurante("Luiz", 130.14, 3),
				new Restaurante("Cacau", 280.4, 2),
				new Restaurante("Renata", 138.11, 1),
				new Restaurante("Rose", 175.19, 4),
				new Restaurante("Lais", 220.74, 6),
				new Restaurante("Clara", 415.2, 5),
				new Restaurante("Roger", 188.85, 7)
				);
		
		List<Object> nomes = getDadosrestaurantes(listarestaurantes, x -> x.getNome());
		nomes.forEach(n -> System.out.println("Nome: "+n));
		
		System.out.println("---------------------------------------------");
		
		List<Object> valores = getDadosrestaurantes(listarestaurantes, x -> x.getValor_pedido());
		valores.forEach(n -> System.out.println("valor: "+n));
		
		System.out.println("---------------------------------------------");
		
		List<Object> mesas = getDadosrestaurantes(listarestaurantes, x -> x.getMesa());
		mesas.forEach(n -> System.out.println("Mesa: "+n));
		
		System.out.println("---------------------------------------------");
		
		List<Object> geral = getDadosrestaurantes(listarestaurantes, x -> "Nome: "+x.getNome()+", Valor: "+x.getValor_pedido()+", mesa: "+x.getMesa());
		geral.forEach(n -> System.out.println(n));
		
		
	}

	public static List<Object> getDadosrestaurantes(List<Restaurante> listaRes, Function<Restaurante, Object> func) {

		//lista que grardara dados personalizados do restaurante
		List<Object> listarDados = new ArrayList<>();
		
		//Interacao com a lista recebida
		for (Restaurante restaurante : listaRes) {
			listarDados.add(func.apply(restaurante));
		}

		return listarDados;

	}

}

