package br.com.serratec.Classes;

public class Hospital {

    private Integer idHospital;
    private String nome;
    private String cnpj;

    public Hospital(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ID Hospital: " + idHospital + ", Nome: " + nome + ", CNPJ: " + cnpj;
    }

    public Integer getIdHospital() {
        return idHospital;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

}
