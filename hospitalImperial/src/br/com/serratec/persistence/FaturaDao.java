package br.com.serratec.persistence;
/*
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
*/

public class FaturaDao {
    /* 
    private Connection connection;

    public FaturaDao() {
        connection = new ConnectionFactory().getConnection();
    }
        
       public List<xxx> listar(){
            String sql = "select * from xxx";
            List<xxx> xxxs = new ArrayList<>();
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    xxx xxx = new xxx(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
                    xxxs.add(xxx);
                }
                rs.close();
                stmt.close();
                connection.close();
            } catch (Exception e) {
                System.err.println("Problema ao listar os xxxs");
                e.printStackTrace();
            }
            return xxxs;
        }
        */
}
