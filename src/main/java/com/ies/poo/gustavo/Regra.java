package com.ies.poo.gustavo;

public class Regra {

	private Casa casa1;
	private Casa casa2;
	private Casa casa3;

	public Regra(Casa casa1, Casa casa2, Casa casa3) {
		this.casa1 = casa1;
		this.casa2 = casa2;
		this.casa3 = casa3;
	}

	public boolean temVitoria() {
		return casa1.obterOpcao().equals(casa2.obterOpcao()) && casa2.obterOpcao().equals(casa3.obterOpcao());
		
	}

	public Opcoes obterOpcaoVitoriosa() {
		return casa1.obterOpcao();
	}
	
	
	
}
