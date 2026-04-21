package br.com.serratec.Classes;
public class Paciente {
    private Integer idPaciente;
    private String nome;
    private String cpf;
    private String telefone;
    private Integer idPlano;//private PlanoSaude plano; ??
    
    public Paciente(Integer idPaciente, String nome, String cpf, String telefone, Integer idPlano) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idPlano = idPlano;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public Integer getIdPlano() {
        return idPlano;
    }
    public Integer getIdPaciente() {
        return idPaciente;
    }
    
}
