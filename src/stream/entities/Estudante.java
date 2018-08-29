package stream.entities;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class Estudante {
	
	private String idenditificacao;
	private int idade;
	private double altura;
	private double media;

	public Estudante(String idenditificacao, int idade, double altura, double media) {
		this.idenditificacao = idenditificacao;
		this.idade = idade;
		this.altura = altura;
		this.media = media;
	}

	public String getIdenditificacao() {
		return idenditificacao;
	}

	public void setIdenditificacao(String idenditificacao) {
		this.idenditificacao = idenditificacao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
}
