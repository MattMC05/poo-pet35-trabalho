package br.com.serratec.Classes;

public class Paciente extends Pessoa{
    private Integer idPaciente;
    private String cpf;
    private String telefone;
    private PlanoSaude plano;

    public Paciente(String nome, Integer idPaciente, String cpf, String telefone, PlanoSaude plano) {
        super(nome);
        this.idPaciente = idPaciente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "ID Paciente: " + idPaciente + ", CPF: " + cpf + ", Telefone: " + telefone + ", Plano: "
                + plano;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public PlanoSaude getPlano() {
        return plano;
    }
    
    public Integer getIdPaciente() {
        return idPaciente;
    }
    
}
