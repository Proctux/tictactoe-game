package com.ies.poo.gustavo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private List<Casa> casas;
	private Casa primeira;
	private Casa segunda;
	private Casa terceira;
	private Casa quarta;
	private Casa quinta;
	private Casa sexta;
	private Casa setima;
	private Casa oitava;
	private Casa nona;
	

	public Tabuleiro() {
		criandoCasas();
		adicionandoCasas();
	}

	private void criandoCasas() {
		casas = new ArrayList<>();
		primeira = new Casa();
		segunda = new Casa();
		terceira = new Casa();
		quarta = new Casa();
		quinta = new Casa();
		sexta = new Casa();
		setima = new Casa();
		oitava = new Casa();
		nona = new Casa();
	}
	
	private void adicionandoCasas() {
		casas.add(primeira);
		casas.add(segunda);
		casas.add(terceira);
		casas.add(quarta);
		casas.add(quinta);
		casas.add(sexta);
		casas.add(setima);
		casas.add(oitava);
		casas.add(nona);
	}

	public List<Casa> obterCasas() {
		return casas;
	}

	public void jogar(Opcoes opcao, Casa casa) {
		casa.recebeJogada(opcao);
		
	}

	public Casa obterPrimeiraCasa() {
		return primeira;
	}
	public Casa obterSegundaCasa() {
		return segunda;
	}
	public Casa obterTerceiraCasa() {
		return terceira;
	}
	public Casa obterQuartaCasa() {
		return quarta;
	}
	public Casa obterQuintaCasa() {
		return quinta;
	}
	public Casa obterSextaCasa() {
		return sexta;
	}
	public Casa obterSetimaCasa() {
		return setima;
	}
	public Casa obterOitavaCasa() {
		return oitava;
	}
	public Casa obterNonaCasa() {
		return nona;
	}

}
