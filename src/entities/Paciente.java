package entities;

/**
 * 
 * @author Luiz.Cesario
 *
 */

public class Paciente {
	
	private String nome;
	private Integer idade;
	private String email;
	
	public Paciente(String nome, Integer idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + "\t idade=" + idade + "]";
	}
	
	public static int compararPorIdade(Paciente p1, Paciente p2) {
		return p1.getIdade().compareTo(p2.getIdade());
	}
	

}
