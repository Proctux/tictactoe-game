package com.ies.poo.gustavo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest2 {
	private Jogador lucas;
	private Jogador nilo;
	private Jogador baiano;
	private Jogador luiz;
	private Jogo tictactoe;
	
	@Before
	public void configuracao() {
		lucas = new Jogador("Lucas");
		nilo = new Jogador("Nilo");
		baiano = new Jogador("Baiano");
		luiz = new Jogador("Luiz");
		
		tictactoe = new Jogo();
	}
	
	@Test
	public void jogadorUmOpcaoXis() throws Exception {
		Opcoes opcaoDoJogadorUm = tictactoe.registrarJogador(baiano);
		assertEquals(Opcoes.XIS, opcaoDoJogadorUm);
	}
	
	@Test
	public void jogadorDoisOpcaoBolinha() throws Exception {
		Opcoes opcaoDoJogadorUm = tictactoe.registrarJogador(baiano);
		Opcoes opcaoDoJogadorDois = tictactoe.registrarJogador(lucas);
		assertEquals(Opcoes.BOLINHA, opcaoDoJogadorDois);
		assertNotEquals(Opcoes.BOLINHA, opcaoDoJogadorUm);
	}
	
	@Test
	public void vencedorXis() throws Exception {
		Opcoes opcaoDoJogadorUm = tictactoe.registrarJogador(baiano);
		Opcoes opcaoDoJogadorDois = tictactoe.registrarJogador(lucas);
		
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(0));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(1));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(4));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(3));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(2));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(8));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(6));
		
		assertEquals(Opcoes.XIS, tictactoe.obterOpcaoVencedora());
	}
	
	@Test
	public void vencedorBolinha() throws Exception {
		Opcoes opcaoDoJogadorUm = tictactoe.registrarJogador(nilo);
		Opcoes opcaoDoJogadorDois = tictactoe.registrarJogador(baiano);
		
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(8));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(1));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(7));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(6));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(5));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(3));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(0));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(4));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(2));
		
		assertEquals(Opcoes.BOLINHA, tictactoe.obterOpcaoVencedora());
	}
	
	@Test
	public void jogoTerminaEmpatado() throws Exception {
		Opcoes opcaoDoJogadorUm = tictactoe.registrarJogador(nilo);
		Opcoes opcaoDoJogadorDois = tictactoe.registrarJogador(luiz);
		
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(4));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(0));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(2));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(6));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(3));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(5));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(7));
		tictactoe.jogar(opcaoDoJogadorDois, tictactoe.obterTabuleiro().obterCasas().get(1));
		tictactoe.jogar(opcaoDoJogadorUm, tictactoe.obterTabuleiro().obterCasas().get(8));
		
		assertEquals(Opcoes.XIS, tictactoe.obterOpcaoVencedora());
		assertEquals(baiano, tictactoe.obterVencedor());
	}
	
	
	
}
