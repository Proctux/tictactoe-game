package com.ies.poo.gustavo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void registrandoDoisJogadores() throws Exception {
		Jogador jogadorUm = new Jogador("Lucas");
		Jogador jogadorDois = new Jogador("Baiano");
		Jogo jogo = new Jogo();
		
		Opcoes opcaoDoJogadorUm = jogo.registrarJogador(jogadorUm);
		Opcoes opcaoDoJogadorDois = jogo.registrarJogador(jogadorDois);
		
		assertEquals(Opcoes.XIS, opcaoDoJogadorUm);
		assertEquals(Opcoes.BOLINHA, opcaoDoJogadorDois);
	}
	
	@Test
	public void oJogo() throws Exception {
		Jogo jogo = new Jogo();
		
		Tabuleiro tabuleiro =  jogo.obterTabuleiro();
		
		assertEquals(9, tabuleiro.obterCasas().size());
	}
	
	@Test
	public void vencedorXis() throws Exception {
		Jogo jogo = new Jogo();
		
		Jogador jogadorUm = new Jogador("Lucas");
		Opcoes opcao = jogo.registrarJogador(jogadorUm);
	
		jogo.jogar(opcao, jogo.obterTabuleiro().obterCasas().get(0));
		jogo.jogar(opcao, jogo.obterTabuleiro().obterCasas().get(1));
		jogo.jogar(opcao, jogo.obterTabuleiro().obterCasas().get(2));
		
		assertEquals(Opcoes.XIS, jogo.obterOpcaoVencedora());
		assertEquals(jogadorUm, jogo.obterVencedor());
	}
	
	@Test
	public void vencedorBolinha() throws Exception {
		Jogo jogo = new Jogo();
		
		Jogador jogadorUm = new Jogador("Lucas");
		Jogador jogadorDois = new Jogador("Baiano");
		jogo.registrarJogador(jogadorUm);
		Opcoes opcaoDois = jogo.registrarJogador(jogadorDois);
	
		jogo.jogar(opcaoDois, jogo.obterTabuleiro().obterPrimeiraCasa());
		jogo.jogar(opcaoDois, jogo.obterTabuleiro().obterCasas().get(4));
		jogo.jogar(opcaoDois, jogo.obterTabuleiro().obterCasas().get(8));
		
		assertEquals(Opcoes.BOLINHA, jogo.obterOpcaoVencedora());
		assertEquals(jogadorDois, jogo.obterVencedor());
	}
}
