package br.com.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import br.com.serratec.Classes.Fatura;
import br.com.serratec.Conexao.ConnectionFactory;
import br.com.serratec.Enums.StatusFaEnum;

public class FaturaDao {
    private static Connection connection;

    public FaturaDao() {
        connection = new ConnectionFactory().getConnection();
    }
        
       public Fatura dadosFatura(Integer id){
            String sql = "select * from fatura where id_fatura = ? and status = 'Pago'";
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Fatura(rs.getInt("id_fatura"),
                    rs.getBigDecimal("valor"),
                    rs.getString("forma_pagamento"),
                    //rs.getObject("status", StatusFaEnum.class),
                    StatusFaEnum.valueOf(rs.getString("status")),
                    rs.getObject("data_emissao", LocalDate.class),
                    rs.getObject("data_vencimento", LocalDate.class),
                    rs.getInt("id_internacao"),
                    rs.getInt("id_atendimento"),
                    rs.getInt("id_exame"));
                }
                rs.close();
                stmt.close();
                connection.close();
            } catch (Exception e) {
                System.err.println("Fatura inexistente");
                e.printStackTrace();
            }
            return null;
        }
        
}
