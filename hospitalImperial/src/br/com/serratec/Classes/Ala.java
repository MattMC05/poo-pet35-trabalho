package br.com.serratec.Classes;

public class Ala {

    private int idAla;
    private int idEnfermeira;
    private String tipo;
    private int leitosDisponiveis;
    private int idHospital;

    public Ala() {
    }

    public Ala(int idEnfermeira, String tipo, int leitosDisponiveis, int idHospital) {
        this.idEnfermeira = idEnfermeira;
        this.tipo = tipo;
        this.leitosDisponiveis = leitosDisponiveis;
        this.idHospital = idHospital;
    }

    public int getIdAla() {
        return idAla;
    }

    public void setIdAla(int idAla) {
        this.idAla = idAla;
    }

    public int getIdEnfermeira() {
        return idEnfermeira;
    }

    public void setIdEnfermeira(int idEnfermeira) {
        this.idEnfermeira = idEnfermeira;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLeitosDisponiveis() {
        return leitosDisponiveis;
    }

    public void setLeitosDisponiveis(int leitosDisponiveis) {
        this.leitosDisponiveis = leitosDisponiveis;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    @Override
    public String toString() {
        return "Ala{"
                + "idAla=" + idAla
                + ", idEnfermeira=" + idEnfermeira
                + ", tipo='" + tipo + '\''
                + ", leitosDisponiveis=" + leitosDisponiveis
                + ", idHospital=" + idHospital
                + '}';
    }

}
