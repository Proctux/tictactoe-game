package com.ies.poo.gustavo;

public class Casa {

	private Opcoes opcao;

	protected void recebeJogada(Opcoes opcao) {
		this.opcao = opcao;
	}

	public Opcoes obterOpcao() {
		return opcao;
	}

}
