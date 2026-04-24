package br.com.serratec;


import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Scanner;

import br.com.serratec.persistence.NotaDao;

public class Arquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o ID da nota que deseja gerar: ");
        Integer id = sc.nextInt();
        var nDao = new NotaDao();

        ResultSet rs = nDao.csvNota(id);

        try {
            if (rs != null) {
                if (rs.next()) {
                    PrintWriter gravarArquivo = new PrintWriter("nota_fiscal"+id+".csv");
                    gravarArquivo.println("Nome;Valor;ISS;PIS;COFINS;IRPJ;CSLL");
                    gravarArquivo.printf("%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f%n",
                            rs.getString("nome_paciente"),
                            rs.getBigDecimal("valor_nota"),
                            rs.getBigDecimal("iss"),
                            rs.getBigDecimal("pis"),
                            rs.getBigDecimal("cofins"),
                            rs.getBigDecimal("irpj"),
                            rs.getBigDecimal("csll")
                    );
                    gravarArquivo.close();
                    System.out.println("Arquivo gerado com sucesso!");
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao gravar arquivo");
            e.printStackTrace();
        }
        sc.close();

        if (nDao.csvNota(id)==null) {
                System.err.println("Nota inexistente");
        }

    }

}
