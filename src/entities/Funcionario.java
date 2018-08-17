package entities;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class Funcionario {
	
	private String nome;
	private int idade;
	private double salario;
	private String departamento;

	public Funcionario(String nome, int idade, double salario, String departamento) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
