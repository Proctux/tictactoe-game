package com.ies.poo.gustavo;

import java.io.IOException;
import java.sql.SQLException;

public class GerenciaDeFimDePartida {
	
	private Jogo tictactoe;
	private ConexaoComBancoDeDados conexao;
	
	public GerenciaDeFimDePartida(Jogo tictactoe) {
		this.tictactoe = tictactoe;
		conexao = new ConexaoComBancoDeDados();
	}

	public void atualizaOBanco() throws SQLException, IOException {
		Jogador obterJogadorVencedor = tictactoe.obterJogadorVencedor();
		obterJogadorVencedor.incrementaVitoria();
		conexao.ganhadorDaPartida(obterJogadorVencedor);
		
		Jogador obterJogadorPerdedor = tictactoe.obterJogadorPerdedor();
		obterJogadorPerdedor.incrementaDerrota();
		conexao.perdedorDaPartida(obterJogadorPerdedor);
	}
	
	
	
}
