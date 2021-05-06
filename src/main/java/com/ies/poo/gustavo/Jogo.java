package com.ies.poo.gustavo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jogo {
	private List<Jogador> jogadores;
	private List<Jogada> jogadas;
	private List<Opcoes> opcoes;
	private Tabuleiro tabuleiro;
	private List<Regra> regrasDeVitoria;
	
	// Feito em aula
	public Jogo() {
		jogadores = new ArrayList<Jogador>();
		jogadas = new ArrayList<Jogada>();
		opcoes = Arrays.asList(Opcoes.XIS, Opcoes.BOLINHA);
		tabuleiro = new Tabuleiro();
		List<Casa> casas = tabuleiro.obterCasas();
		regrasDeVitoria = new ArrayList<>();
		regrasDeVitoria.add(new Regra(casas.get(0), casas.get(1), casas.get(2)));
		regrasDeVitoria.add(new Regra(casas.get(0), casas.get(4), casas.get(8)));
	}
	
	public Opcoes registrarJogador(Jogador jogador) {
		jogadores.add(jogador);
		return opcoes.get(jogadores.size() - 1);
	}

	public Tabuleiro obterTabuleiro() {
		return tabuleiro;
	}

	public void jogar(Opcoes opcao, Casa casa) {
		tabuleiro.jogar(opcao, casa);
	}

	public Opcoes obterOpcaoVencedora() {
		Regra regraDeVitoria = deUmaRegraVencedora();
		return regraDeVitoria.obterOpcaoVitoriosa();
	}

	private Regra deUmaRegraVencedora() {
		for(Regra regra: regrasDeVitoria) {
			if(regra.temVitoria()) {
				return regra;
			}
		}
		return null;
	}

	public Jogador obterVencedor() {
		Opcoes opcaoVitoriosa = obterOpcaoVencedora();
		return jogadores.get(opcoes.indexOf(opcaoVitoriosa));
	}

}
