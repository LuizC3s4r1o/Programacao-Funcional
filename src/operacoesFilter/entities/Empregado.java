package operacoesFilter.entities;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Luiz.Cesario
 *
 */
@SuppressWarnings("rawtypes")
public class Empregado implements Comparable{
	
	private long id;
	private String nome;
	private double salario;
	private int idade;
	private Genero genero;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public static enum Genero {
		HOMEM, MULHER
	}


	public Empregado(long id, String nome, double salario, Genero genero, int idade) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.genero = genero;
		this.idade = idade;
	}
	
	public boolean isHomem() {
		return this.genero == Genero.HOMEM;
	}
	
	public boolean isMulher() {
		return this.genero == Genero.MULHER;
	}
	
	public static List<Empregado> empregados(){
				Empregado emp01 = new Empregado(1, "Luiz C3s4r1o", 325.23, Genero.HOMEM, 37);
				Empregado emp02 = new Empregado(2, "Rafael Martins", 508.73, Genero.HOMEM, 27);
				Empregado emp03 = new Empregado(3, "Luzia Restri", 401.11, Genero.MULHER, 28);
				Empregado emp04 = new Empregado(4, "Ana Paula", 165.26, Genero.MULHER, 19);
				Empregado emp05 = new Empregado(5, "Roberto Justos", 750.14, Genero.HOMEM, 22);
				Empregado emp06 = new Empregado(6, "Fabiana Percario", 501.36, Genero.MULHER, 20);
				Empregado emp07 = new Empregado(7, "Robson Rodrigues", 723.55, Genero.HOMEM, 29);
				Empregado emp08 = new Empregado(8, "Rafaela Antunes", 402.96, Genero.MULHER, 28);
				Empregado emp09 = new Empregado(9, "Joaquim Eugideo", 666.15, Genero.HOMEM, 35);
				Empregado emp10 = new Empregado(10, "Sula Matinez", 326.89, Genero.MULHER, 31);
				Empregado emp11 = new Empregado(11, "Paulo Andrade", 600.20, Genero.HOMEM, 26);
				Empregado emp12 = new Empregado(12, "Pedro Moito", 701.14, Genero.HOMEM, 39);
				Empregado emp13 = new Empregado(13, "Angelica Rurtz", 902.16, Genero.MULHER, 45);
				Empregado emp14 = new Empregado(14, "Jose Nortega", 800, Genero.HOMEM, 54);
				Empregado emp15 = new Empregado(15, "Michele Miller", 801.87, Genero.MULHER, 52);
				Empregado emp16 = new Empregado(16, "Monica Alves", 458.88, Genero.MULHER, 33);
				Empregado emp17 = new Empregado(17, "Andre Mafre", 302.85, Genero.HOMEM, 28);
				Empregado emp18 = new Empregado(18, "Roseli Souza", 336.68, Genero.MULHER, 39);
				Empregado emp19 = new Empregado(19, "Gabriela Monte", 489.89, Genero.MULHER, 29);
				Empregado emp20 = new Empregado(20, "Marcio Martinelli", 299.68, Genero.HOMEM, 18);
				Empregado emp21 = new Empregado(21, "Monica Sanches", 574.17, Genero.MULHER, 25);
				Empregado emp22 = new Empregado(22, "Luiz Ferrari", 691.15, Genero.HOMEM, 32);
				Empregado emp23 = new Empregado(23, "Beatriz Soules", 454.44, Genero.MULHER, 37);
				Empregado emp24 = new Empregado(24, "Noeli Fernandes", 396.18, Genero.MULHER, 41);
				Empregado emp25 = new Empregado(25, "Jucelio Rocha", 488.01, Genero.HOMEM, 44);
				Empregado emp26 = new Empregado(26, "Rogerio Gomides", 500.25, Genero.HOMEM, 38);
				Empregado emp27 = new Empregado(27, "Saulo Silva", 743.59, Genero.HOMEM, 22);
				Empregado emp28 = new Empregado(28, "Renata Cibelli", 568.48, Genero.MULHER, 26);
				Empregado emp29 = new Empregado(29, "Joice Maldoa", 419.09, Genero.MULHER, 34);
				Empregado emp30 = new Empregado(30, "Felipe Maldonado", 618.81, Genero.HOMEM, 33);
				Empregado emp31 = new Empregado(31, "Marta Rocha", 385.85, Genero.MULHER, 26);
				Empregado emp32 = new Empregado(32, "Katia Cerafim", 669.96, Genero.MULHER, 21);
				Empregado emp33 = new Empregado(33, "Marcel Ceratti", 705.95, Genero.HOMEM, 17);
				Empregado emp34 = new Empregado(34, "Catia Dultra", 614.14, Genero.MULHER, 36);
				
				
				return Arrays.asList(emp01,emp02,emp03,emp04,emp05,emp06,emp07,emp08,emp09,emp10,
						emp11,emp12,emp13,emp14,emp15,emp16,emp17,emp18,emp19,emp20,emp21,emp22,
						emp23,emp24,emp25,emp26,emp27,emp28,emp29,emp30,emp31,emp32,emp33,emp34);
				
	}

	@Override
	public int compareTo(Object o) {
		return this.getNome().compareTo(((Empregado)o).getNome());
	}
	

}
