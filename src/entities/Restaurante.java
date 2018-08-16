package entities;

public class Restaurante {
	
	String nome;
	double valor_pedido;
	int mesa;

	public Restaurante(String nome, double valor_pedido, int mesa) {
		this.nome = nome;
		this.valor_pedido = valor_pedido;
		this.mesa = mesa;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor_pedido() {
		return valor_pedido;
	}

	public void setValor_pedido(double valor_pedido) {
		this.valor_pedido = valor_pedido;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	

}
