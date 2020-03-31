package com.gft.service;

import com.gft.model.Voo;

public class PrecoPassagemGold implements CalculadoraPrecoPassagem{

	@Override
	public double Calcular( Voo voo) {
		if(voo.getPreco() > 500)
			return calcularValorAcimaLimite(voo);
		return calcularValorAbaixoLimite(voo);
	}

	private double calcularValorAbaixoLimite(Voo voo) {
		return voo.getPreco() * 0.9;
	}

	private double calcularValorAcimaLimite(Voo voo) {
		return voo.getPreco() * 0.85;
	}

}
