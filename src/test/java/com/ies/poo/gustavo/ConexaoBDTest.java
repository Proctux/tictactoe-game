package com.ies.poo.gustavo;

import org.junit.Before;
import org.junit.Test;

public class ConexaoBDTest {

	private Jogador lucas;
	private Jogador nilo;
	private Jogador baiano;
	private Jogador luiz;
	
	@Before
	public void configuracao() {
		lucas = new Jogador("Lucas", 0, 0, 0);
		nilo = new Jogador("Nilo", 0, 0, 0);
		baiano = new Jogador("Baiano", 0, 0, 0);
		luiz = new Jogador("Luiz", 0, 0, 0);
	}
	
	@Test
	public void registrarJogadoresNoBanco() throws Exception {
		ConexaoComBancoDeDados conexao = new ConexaoComBancoDeDados();
		conexao.persistir(nilo);
		conexao.persistir(baiano);
		conexao.persistir(lucas);
		conexao.persistir(luiz);
	}
	
	
	
	
	
}
