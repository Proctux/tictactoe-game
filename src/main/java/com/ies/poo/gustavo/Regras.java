package com.ies.poo.gustavo;

public class Regras {
	private Jogada jogada;
	
	public Regras(Jogada jogada) {
		this.jogada = jogada;
	}

	public void condicaoDeVitoria() {
		Campo campo00 = new Campo("00");
		Campo campo01 = new Campo("01");
		Campo campo02 = new Campo("02");
		Campo campo10 = new Campo("10");
		Campo campo11 = new Campo("11");
		Campo campo12 = new Campo("12");
		Campo campo20 = new Campo("20");
		Campo campo21 = new Campo("21");
		Campo campo22 = new Campo("22");
		
		System.out.println(condicao01(campo00, campo11, campo22));
	}
	
	public Boolean condicao01(Campo campo00, Campo campo11, Campo campo22) {
		if(campoPreenchido(campo00) && campoPreenchido(campo11) && campoPreenchido(campo22) && mesmaOpcao(campo00, campo11, campo22)) {
			return true;
		}
		return false;
	}
	
	public Boolean campoPreenchido(Campo campo) {
		return jogada.retornarCampos().contains(campo.getCasa());
	}
	
	public Integer getIndex(Campo campo) {
		return jogada.retornarCampos().indexOf(campo.getCasa());
	}
	
	public Boolean mesmaOpcao(Campo campo1, Campo campo2, Campo campo3) {
		if(jogada.retornarOpcoes().get(getIndex(campo1)) == jogada.retornarOpcoes().get(getIndex(campo2)) 
			&& jogada.retornarOpcoes().get(getIndex(campo1)) == jogada.retornarOpcoes().get(getIndex(campo3))) {
			return true;
		}
		return false;
	}
	
}
