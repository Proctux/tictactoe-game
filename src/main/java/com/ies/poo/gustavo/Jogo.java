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
		listaDeRegras(casas);
	}

	private void listaDeRegras(List<Casa> casas) {
		regrasDeVitoria = new ArrayList<>();
		regrasDeVitoria.add(new Regra(casas.get(0), casas.get(1), casas.get(2)));
		regrasDeVitoria.add(new Regra(casas.get(3), casas.get(4), casas.get(5)));
		regrasDeVitoria.add(new Regra(casas.get(6), casas.get(7), casas.get(8)));
		regrasDeVitoria.add(new Regra(casas.get(0), casas.get(3), casas.get(6)));
		regrasDeVitoria.add(new Regra(casas.get(1), casas.get(4), casas.get(7)));
		regrasDeVitoria.add(new Regra(casas.get(2), casas.get(5), casas.get(8)));
		regrasDeVitoria.add(new Regra(casas.get(0), casas.get(4), casas.get(8)));
		regrasDeVitoria.add(new Regra(casas.get(2), casas.get(4), casas.get(6)));
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
