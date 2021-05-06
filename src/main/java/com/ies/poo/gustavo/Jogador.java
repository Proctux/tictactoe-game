package com.ies.poo.gustavo;

public class Jogador {

	private Integer id;
	private String nome;
	private Integer quantidadePontuacao;
	private Integer quantidadePartidas;
	private Integer quantidadeVitorias;
	private Integer quantidadeDerrotas;
	private Integer quantidadeEmpates;
	
	// Feito em aula
	public Jogador(String nome) {
		this.nome = nome;
	}

	public Jogador(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String dadosDoJogador() {
		return id + "\n" + nome + "\n" + quantidadePontuacao + "\n" + quantidadePartidas + "\n" + quantidadeVitorias
				+ quantidadeDerrotas + "\n" + quantidadeEmpates;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadePontuacao() {
		return quantidadePontuacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.quantidadePontuacao = classificacao;
	}

	public Integer getQuantidadePartidas() {
		return quantidadePartidas;
	}

	public void setQuantidadePartidas(Integer quantidadePartidas) {
		this.quantidadePartidas = quantidadePartidas;
	}

	public Integer getQuantidadeVitorias() {
		return quantidadeVitorias;
	}

	public void setQuantidadeVitorias(Integer quantidadeVitorias) {
		this.quantidadeVitorias = quantidadeVitorias;
	}

	public Integer getQuantidadeDerrotas() {
		return quantidadeDerrotas;
	}

	public void setQuantidadeDerrotas(Integer quantidadeDerrotas) {
		this.quantidadeDerrotas = quantidadeDerrotas;
	}

	public Integer getQuantidadeEmpates() {
		return quantidadeEmpates;
	}

	public void setQuantidadeEmpates(Integer quantidadeEmpates) {
		this.quantidadeEmpates = quantidadeEmpates;
	}

}
