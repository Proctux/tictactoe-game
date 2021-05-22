package com.ies.poo.gustavo;

public class Jogador {

	private Integer id;
	private String nome;
	private Integer quantidadeVitorias;
	private Integer quantidadeDerrotas;
	private Integer quantidadeEmpates;
	
	// Feito em aula
	public Jogador(String nome, Integer quantidadeVitorias, Integer quantidadeDerrotas, Integer quantidadeEmpates) {
		this.nome = nome;
		this.quantidadeVitorias = quantidadeVitorias;
		this.quantidadeDerrotas = quantidadeDerrotas;
		this.quantidadeEmpates = quantidadeEmpates;
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
