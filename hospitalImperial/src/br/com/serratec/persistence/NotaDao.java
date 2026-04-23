package br.com.serratec.persistence;
/*
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
*/
public class NotaDao {
    /*
    private Connection connection;

    public FaturaDao() {
        connection = new ConnectionFactory().getConnection();
    }
    
   public void inserir(Cliente cliente){
        String sql = "insert into cliente(nome,email) values (?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.execute();
            stmt.close();
            connection.close();
            System.out.println("Cliente inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro, cliente não inserido!");
        }
    }
    */
    /*
        public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome do arquivo: ");
            String nomeArquivo = sc.nextLine();

            File file = new File(nomeArquivo);
            Scanner scArquivo = new Scanner(file,"UTF-8");
            List<Funcionario> funcionarios = new ArrayList<>();
            while (scArquivo.hasNext()) {
                String linha = scArquivo.nextLine();
                if (!linha.isEmpty()) {
                    String[] dadosLinha = linha.split(";");
                    String nome = dadosLinha[0];
                    String profissao = dadosLinha[1];
                    funcionarios.add(new Funcionario(nome, profissao));
                }
            }
            sc.close();
            System.out.println("Gravar em um novo arquivo");
            for (Funcionario funcionario : funcionarios) {
                    System.out.println(funcionario);
            }

            System.out.println("Gravar em um novo arquivo");
            FileWriter caminho = new FileWriter("\\aula\\funcionarios.csv");
            PrintWriter gravarArquivo = new PrintWriter(caminho);
            for (Funcionario funcionario : funcionarios) {
                String linhaArquivo = funcionario.getNome() + ";" + funcionario.getProfissao() + "\n";
                gravarArquivo.printf(linhaArquivo);
            }

            gravarArquivo.close();
            scArquivo.close();
        } catch (Exception e) {
            System.err.println("Arquivo não encontrado!");
        }
    }*/

}
