package com.ies.poo.gustavo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private List<Casa> casas;
	private Casa primeira;

	public Tabuleiro() {
		casas = new ArrayList<>();
		primeira = new Casa();
		Casa segunda = new Casa();
		Casa terceira = new Casa();
		Casa quarta = new Casa();
		Casa quinta = new Casa();
		Casa sexta = new Casa();
		Casa setima = new Casa();
		Casa oitava = new Casa();
		Casa nona = new Casa();

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

}
