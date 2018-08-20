package entities;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class Alunos {
	
	private String nome;
	private double classificacao;

	public Alunos(String nome, double classificacao) {
		this.nome = nome;
		this.classificacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(double classificacao) {
		this.classificacao = classificacao;
	}
}
