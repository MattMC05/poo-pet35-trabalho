package br.com.serratec.Classes;
public class Medico extends Pessoa{
    private Integer idMedico;
    private String especialidade;
    private String crm;
    

    public Medico(String nome, Integer idMedico, String especialidade, String crm) {
        super(nome);
        this.idMedico = idMedico;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public Integer getIdMedico() {
        return idMedico;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }
    
}
