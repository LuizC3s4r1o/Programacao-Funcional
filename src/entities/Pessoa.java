package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class Pessoa implements Comparable<Pessoa> {

	private int id;
	private String nome;
	private LocalDate dataNacimento;

	public Pessoa() {
	}
	
	public Pessoa(int id, String nome, LocalDate dataNacimento) {
		this.id = id;
		this.nome = nome;
		this.dataNacimento = dataNacimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(LocalDate dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	@Override
	public String toString() {
		return "\nid: " + id + 
				"\t, nome: " + nome + 
				"\t, dataNacimento: " + dataNacimento.format(formatter);
	}

	@Override
	public int compareTo(Pessoa p) {
		int resultado = this.nome.compareTo(p.nome);
		return resultado;
	}
	
}
