package com.ies.poo.gustavo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoComBancoDeDados {

	public Connection getConexao() throws SQLException {
		String url //urlBancoDeDados;
		String masterUser //HOST;
		String masterKey //PASSWORD;
		return DriverManager.getConnection(url, masterUser, masterKey);
	}

	public void inserirJogador(Jogador jogador) throws SQLException, IOException {
		Connection conexao = getConexao();

		PreparedStatement afirmacao = conexao.prepareStatement(
				"INSERT INTO apspoo.jogador (nm_jogador, qt_vitorias, qt_derrotas, qt_empates) VALUES (?, ?, ?, ?) RETURNING cd_jogador;");

		afirmacao.setString(1, jogador.getNome());
		afirmacao.setInt(2, jogador.getQuantidadeVitorias());
		afirmacao.setInt(3, jogador.getQuantidadeDerrotas());
		afirmacao.setInt(4, jogador.getQuantidadeEmpates());
		
		
		afirmacao.execute();
		ResultSet retorno = afirmacao.getResultSet();
		retorno.next();	

		jogador.setId(retorno.getInt(1));
		
		afirmacao.close();
		conexao.close();
	}

	public void ganhadorDaPartida(Jogador jogador) throws SQLException, IOException {
		Connection conexao = getConexao();

		PreparedStatement vitoria = conexao.prepareStatement("UPDATE apspoo.jogador SET qt_vitorias = ? WHERE nm_jogador = ?;");

		vitoria.setInt(1, jogador.getQuantidadeVitorias());
		vitoria.setString(2, jogador.getNome());

		vitoria.execute();
		vitoria.close();
		conexao.close();
	}

	public void perdedorDaPartida(Jogador jogador) throws SQLException, IOException {
		Connection conexao = getConexao();

		PreparedStatement derrota = conexao.prepareStatement("UPDATE apspoo.jogador SET qt_derrotas = ? WHERE nm_jogador = ?;");

		derrota.setInt(1, jogador.getQuantidadeDerrotas());
		derrota.setString(2, jogador.getNome());

		derrota.execute();
		derrota.close();
		conexao.close();
	}

	public void atualizaJogador(Jogador jogador) throws SQLException {
		Connection conexao = getConexao();

		PreparedStatement dados = conexao.prepareStatement("UPDATE apspoo.jogador SET qt_vitorias = ?, qt_derrotas = ?, qt_empates = ? WHERE cd_jogador = ?;");

		dados.setInt(1, jogador.getQuantidadeVitorias());
		dados.setInt(2, jogador.getQuantidadeDerrotas());
		dados.setInt(3, jogador.getQuantidadeEmpates());
		dados.setInt(4, jogador.getId());

		dados.execute();
		dados.close();
		conexao.close();
	}
}
