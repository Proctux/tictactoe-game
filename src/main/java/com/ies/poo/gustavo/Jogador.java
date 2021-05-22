package com.ies.poo.gustavo;

public class Jogador {

	private Integer id;
	private String nome;
	private Integer quantidadeVitorias;
	private Integer quantidadeDerrotas;
	private Integer quantidadeEmpates;
	
	// Feito em aula
	public Jogador(String nome) {
		this.nome = nome;
		this.quantidadeVitorias = 0;
		this.quantidadeDerrotas = 0;
		this.quantidadeEmpates = 0;
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

	public void incrementaVitoria() {
		quantidadeVitorias++;
	}
	
	public void incrementaDerrota() {
		quantidadeDerrotas++;
	}
	
	public void incrementaEmpate() {
		quantidadeEmpates++;
	}

}
