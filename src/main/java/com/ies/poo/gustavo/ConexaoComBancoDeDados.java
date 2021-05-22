package com.ies.poo.gustavo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoComBancoDeDados {

	public Connection getConexao() throws SQLException {
		String url = "jdbc:postgresql://database-1-poo.cgp4xmrdojog.us-east-1.rds.amazonaws.com:5432/postgres";
		String masterUser = "dbpoo2021";
		String masterKey = "#DBp002021";
		return (Connection) DriverManager.getConnection(url, masterUser, masterKey);
	}

	public void persistir(Jogador jogador) throws SQLException, IOException {
		Connection conexao = getConexao();

		PreparedStatement afirmacao = ((java.sql.Connection) conexao).prepareStatement(
				"INSERT INTO apspoo.jogador (nm_jogador, qt_vitorias, qt_derrotas, qt_empates) VALUES (?, ?, ?, ?);");

		afirmacao.setString(1, jogador.getNome());
		afirmacao.setInt(2, jogador.getQuantidadeVitorias());
		afirmacao.setInt(3, jogador.getQuantidadeDerrotas());
		afirmacao.setInt(4, jogador.getQuantidadeEmpates());

		afirmacao.execute();
		afirmacao.close();
		conexao.close();
	}

	public void ganhadorDaPartida(Jogador jogador) throws SQLException, IOException {
		Connection conexao = getConexao();

		PreparedStatement vitoria = ((java.sql.Connection) conexao).prepareStatement("UPDATE apspoo.jogador SET qt_vitorias = ? WHERE nm_jogador = ?;");

		vitoria.setInt(1, jogador.getQuantidadeVitorias());
		vitoria.setString(2, jogador.getNome());

		vitoria.execute();
		vitoria.close();
		conexao.close();
	}

	public void perdedorDaPartida(Jogador jogador) throws SQLException, IOException {
		Connection conexao = getConexao();

		PreparedStatement derrota = ((java.sql.Connection) conexao).prepareStatement("UPDATE apspoo.jogador SET qt_derrotas = ? WHERE nm_jogador = ?;");

		derrota.setInt(1, jogador.getQuantidadeDerrotas());
		derrota.setString(2, jogador.getNome());

		derrota.execute();
		derrota.close();
		conexao.close();
	}
}
