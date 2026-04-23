package br.com.serratec.Classes;
import br.com.serratec.Enums.Cobertura;

public class PlanoSaude {
    private Integer idPlanoSaude;
    private String nome;
    private String telefone;
    private Cobertura cobertura;
    
    public PlanoSaude(Integer idPlanoSaude, String nome, String telefone, Cobertura cobertura) {
        this.idPlanoSaude = idPlanoSaude;
        this.nome = nome;
        this.telefone = telefone;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "ID Plano de Saúde: " + idPlanoSaude + ", Nome: " + nome + ", Telefone: " + telefone
                + ", Cobertura: " + cobertura;
    }

    public Integer getIdPlanoSaude() {
        return idPlanoSaude;
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
