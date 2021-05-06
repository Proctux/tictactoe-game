package com.ies.poo.gustavo;

import java.util.ArrayList;
import java.util.List;

public class Jogada {
	private List<String> campo;
	private List<Opcoes> opcao;
	
	public Jogada() {
		this.campo = new ArrayList<String>();
		this.opcao = new ArrayList<Opcoes>();
	}
	
	public void adicionarJogada(Campo campo, Opcoes opcao) {
		this.campo.add(campo.getCasa());
		this.opcao.add(opcao);
	}
	
	public List<String> retornarCampos() {
		return campo;
	}
	
	public List<Opcoes> retornarOpcoes() {
		return opcao;
	}
	
}