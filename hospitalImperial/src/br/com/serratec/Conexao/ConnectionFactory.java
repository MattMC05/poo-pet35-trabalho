package br.com.serratec.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionFactory {
    Dotenv dotenv = Dotenv.load();
    private String url = dotenv.get("DB_HOST");
    private String usuario = dotenv.get("DB_USER");
    private String senha = dotenv.get("DB_PASSWORD");

    private Connection connection;

    public Connection getConnection() {
        System.out.println("Conectando no banco de dados....");
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
                return connection;
            } else {
                System.out.println("Não foi possível conectar!");
            }

        } catch (SQLException e) {
            System.out.println("Problemas no Driver ou senha incorreta do banco");
            e.printStackTrace();
        }
        return connection;
    }

}