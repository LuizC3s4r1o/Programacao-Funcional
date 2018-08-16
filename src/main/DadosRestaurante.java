package main;

import java.util.function.Function;

import entities.Restaurante;

public class DadosRestaurante {

	public static void main(String[] args) {
		Restaurante res1 = new Restaurante("Luiz", 251.3, 2);
		
		String nomeRes = (String) getDadosRestaurante(res1, x -> x.getNome());
		int numeroMesa = (int) getDadosRestaurante(res1, x -> x.getMesa());
		
		
		System.out.println("Nome: "+nomeRes);
		System.out.println("Mesa numero: "+numeroMesa);

	}

	public static Object getDadosRestaurante(Restaurante res, Function<Restaurante, Object> func) {
		
		return func.apply(res);

	}

}

