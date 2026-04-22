package br.com.serratec.Classes;
import br.com.serratec.Enums.Cobertura;

public class PlanoSaude {
    private Integer PlanoSaude;
    private String nome;
    private String telefone;
    private Cobertura cobertura;

    
    public PlanoSaude(Integer planoSaude, String nome, String telefone, Cobertura cobertura) {
        PlanoSaude = planoSaude;
        this.nome = nome;
        this.telefone = telefone;
        this.cobertura = cobertura;
    }


    public Integer getPlanoSaude() {
        return PlanoSaude;
    }


    public String getNome() {
        return nome;
    }


    public String getTelefone() {
        return telefone;
    }


    public Cobertura getCobertura() {
        return cobertura;
    }

    


}
