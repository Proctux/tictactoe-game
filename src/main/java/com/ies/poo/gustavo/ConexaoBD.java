package com.ies.poo.gustavo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBD {
	
	public Connection getConexao() throws SQLException {
		String url = "jdbc:postgresql://database-1-poo.cgp4xmrdojog.us-east-1.rds.amazonaws.com:5432/postgres";
		String masterUser = "dbpoo2021";
		String masterKey = "#DBp002021";
		return (Connection) DriverManager.getConnection(url, masterUser, masterKey);
	}
	
	public void persistir(JogadorBD jogador) throws SQLException, IOException {
		Connection conexao = getConexao();
		
		PreparedStatement afirmacao = ((java.sql.Connection) conexao).prepareStatement(
		"INSERT INTO apspoo.jogador (nm_jogador) VALUES (?) RETURNING cd_jogador;");
		
		afirmacao.setString(1, jogador.getNome());
		
//		if (jogador.getIdade() == null) {
//			afirmacao.setObject(2, null);
//		} else {
//			afirmacao.setInt(2, jogador.getIdade());
//		}
		
		afirmacao.execute();
		
		ResultSet resultado = afirmacao.getResultSet();
		resultado.next();
		
		jogador.setId(resultado.getInt(1));
		
		resultado.close();
		afirmacao.close();
		conexao.close();
	}
}
