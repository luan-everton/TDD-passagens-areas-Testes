package com.gft.model;

import com.gft.service.CalculadoraPrecoPassagem;

import com.gft.service.PrecoPassagemGold;
import com.gft.service.PrecoPassagemSilver;

public enum TipoPassageiro {
	
	GOLD(new PrecoPassagemGold()),
	SILVER(new PrecoPassagemSilver());

	CalculadoraPrecoPassagem calculadoraPrecoPassagem;
	TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
		
	}
	public CalculadoraPrecoPassagem getCalculadoraPrecoPassagem() {
		return calculadoraPrecoPassagem;
	}
	public void setCalculadoraPrecoPassagem(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}
	
	
	
	
}
