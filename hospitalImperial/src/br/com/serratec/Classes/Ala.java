package br.com.serratec.Classes;

public class Ala {

    private int idAla;
    private int idEnfermeira;
    private String tipo;
    private int leitosDisponiveis;
    private Hospital hospital;

    public Ala() {
    }

    public Ala(int idEnfermeira, String tipo, int leitosDisponiveis, Hospital hospital) {
        this.idEnfermeira = idEnfermeira;
        this.tipo = tipo;
        this.leitosDisponiveis = leitosDisponiveis;
        this.hospital = hospital;
    }

    public int getIdAla() {
        return idAla;
    }


    public int getIdEnfermeira() {
        return idEnfermeira;
    }

   
    public String getTipo() {
        return tipo;
    }


    public int getLeitosDisponiveis() {
        return leitosDisponiveis;
    }


    public Hospital getHospital() {
        return hospital;
    }

    
    @Override
    public String toString() {
        return "Ala{"
                + "idAla=" + idAla
                + ", idEnfermeira=" + idEnfermeira
                + ", tipo='" + tipo + '\''
                + ", leitosDisponiveis=" + leitosDisponiveis
                + ", hospital=" + hospital
                + '}';
    }

}
