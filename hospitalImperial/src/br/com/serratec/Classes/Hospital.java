package br.com.serratec.Classes;

public class Hospital {

    private int idHospital;
    private String nome;
    private String cnpj;

    public Hospital() {
    }

    public Hospital(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Hospital{"
                + "idHospital=" + idHospital
                + ", nome='" + nome + '\''
                + ", cnpj='" + cnpj + '\''
                + '}';
    }

}
