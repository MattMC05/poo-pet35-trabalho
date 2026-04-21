package br.com.serratec.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
        var connect = new ConnectionFactory();
        connect.getConnection();
    }
}
