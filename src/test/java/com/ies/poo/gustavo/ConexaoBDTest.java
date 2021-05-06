package com.ies.poo.gustavo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConexaoBDTest {

	@Test
	public void conexao() throws Exception {
		JogadorBD gustavo = new JogadorBD();
		gustavo.setNome("GustavoBaiano");
		ConexaoBD conexao = new ConexaoBD();
		conexao.persistir(gustavo);
		assertNotNull(gustavo.getId());
	}

}
