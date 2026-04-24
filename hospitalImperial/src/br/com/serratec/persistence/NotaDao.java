package br.com.serratec.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.serratec.Classes.NotaFiscal;
import br.com.serratec.Conexao.ConnectionFactory;

import java.sql.Connection;

public class NotaDao {
    private Connection connection;
        public NotaDao() {
        connection = new ConnectionFactory().getConnection();
    }
    public void inserir(NotaFiscal nota){
        
        String sql = "insert into nota_fiscal(nome_emissor, descricao, valor,iss,pis,cofins,irpj,csll,id_fatura) values ('Hospital Imperial','Operações do Hospital',?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setBigDecimal(1, nota.getValorNota());
            stmt.setBigDecimal(2, nota.getIss());
            stmt.setBigDecimal(3, nota.getPis());
            stmt.setBigDecimal(4, nota.getCofins());
            stmt.setBigDecimal(5, nota.getIrpj());
            stmt.setBigDecimal(6, nota.getCsll());
            stmt.setInt(7, nota.getFatura().getIdFatura());
            stmt.execute();
            stmt.close();
            connection.close();
            System.out.println("Nota inserida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro, nota não inserido!");
        }
    }

    public NotaFiscal dadosNota(Integer id){
            String sql = "select * from nota_fiscal where id_nota = ?";
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new NotaFiscal(rs.getInt("id_nota"),
                    rs.getString("nome_emissor"),
                    rs.getString("descricao"),
                    rs.getBigDecimal("valor"),
                    rs.getBigDecimal("iss"),
                    rs.getBigDecimal("pis"),
                    rs.getBigDecimal("cofins"),
                    rs.getBigDecimal("irpj"),
                    rs.getBigDecimal("csll"),
                    rs.getInt("id_fatura"));
                }
                rs.close();
                stmt.close();
                connection.close();
            } catch (Exception e) {
                System.err.println("Nota inexistente");
                e.printStackTrace();
            }
            return null;
        }
        
        public ResultSet csvNota(Integer id){
            String sql = "select p.nome as nome_paciente, nf.valor as valor_nota, nf.iss, nf.pis, nf.cofins, nf.irpj, nf.csll from nota_fiscal nf inner join fatura f on nf.id_fatura = f.id_fatura inner join exame e on f.id_exame = e.id_exame inner join atendimento a on e.id_atendimento = a.id_atendimento inner join paciente p on a.id_paciente = p.id_paciente where id_nota = ? union all select p.nome as nome_paciente, nf.valor as valor_nota, nf.iss, nf.pis, nf.cofins, nf.irpj, nf.csll from nota_fiscal nf inner join fatura f on nf.id_fatura = f.id_fatura inner join internacao i on f.id_internacao  = i.id_internacao inner join atendimento a on i.id_atendimento = a.id_atendimento inner join paciente p on a.id_paciente = p.id_paciente where id_nota = ? union all select p.nome as nome_paciente, nf.valor as valor_nota, nf.iss, nf.pis, nf.cofins, nf.irpj, nf.csll from nota_fiscal nf inner join fatura f on nf.id_fatura = f.id_fatura inner join atendimento a on f.id_atendimento = a.id_atendimento inner join paciente p on a.id_paciente = p.id_paciente where id_nota = ?";
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, id);
                stmt.setInt(2, id);
                stmt.setInt(3, id);
                return stmt.executeQuery();
            } catch (Exception e) {
                System.err.println("Nota inexistente");
                e.printStackTrace();
            }
            return null;
        }
}
