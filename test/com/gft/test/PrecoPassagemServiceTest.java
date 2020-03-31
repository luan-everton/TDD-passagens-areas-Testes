package com.gft.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gft.model.Passageiro;
import com.gft.model.TipoPassageiro;
import com.gft.model.Voo;
import com.gft.service.PrecoPassagemService;

public class PrecoPassagemServiceTest {

	private PrecoPassagemService precoPassagemService;

	@Before
	public void setup() {
		precoPassagemService = new PrecoPassagemService();
	}

	private void assertValorPassagem(Passageiro passageiro, Voo voo, double esperado) {
		double valor = precoPassagemService.calcular(passageiro, voo);
		assertEquals(esperado, valor, 0.0001);
	}

	@Test
	public void deveCalcularPrecoPassagemParaPassageiroGold_ComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Lucas", TipoPassageiro.GOLD);

		Voo voo = new Voo("São Paulo ", "Rio de Janeiro", 100.0);
		assertValorPassagem(passageiro, voo, 90.0);

	}

	@Test
	public void deveCalcularPrecoPassagemParaPassageiroGold_ComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Lucas", TipoPassageiro.GOLD);

		Voo voo = new Voo("São Paulo ", "Rio de Janeiro", 600.0);

		assertValorPassagem(passageiro, voo, 510.0);
	}
	@Test
	public void deveCalcularPrecoPassagemParaPassageiroSilver_ComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Lucas", TipoPassageiro.SILVER);

		Voo voo = new Voo("São Paulo ", "Rio de Janeiro", 100.0);
		assertValorPassagem(passageiro, voo, 94.0);

	}
	@Test
	public void deveCalcularPrecoPassagemParaPassageiroSilver_ComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Lucas", TipoPassageiro.SILVER);

		Voo voo = new Voo("São Paulo ", "Rio de Janeiro", 800.0);
		assertValorPassagem(passageiro, voo, 720.0);
		
	}

}
