package com.gft.model;

public class Voo {
	
	private String destino;
	
	private String origem;
	
	private double preco;

	public Voo(String destino, String origem, double preco) {
		this.destino = destino;
		this.origem = origem;
		this.preco = preco;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}