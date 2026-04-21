package br.com.serratec.Classes;
public class Medico {
    private Integer idMedico;
    private String nome;
    private String especialidade;
    private String crm;
    
    public Medico(Integer idMedico, String nome, String especialidade, String crm) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }
    
}
