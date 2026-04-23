package br.com.serratec.Classes;

import br.com.serratec.Enums.Turno;

public class Enfermeira extends Pessoa {
    private Integer idEnfermeira;
    private String cre;
    private Turno turno;
    private Enfermeira chefe;

    public Enfermeira(String nome, Integer idEnfermeira, String cre, Turno turno, Enfermeira chefe) {
        super(nome);
        this.idEnfermeira = idEnfermeira;
        this.cre = cre;
        this.turno = turno;
        this.chefe = chefe;
    }

    @Override
    public String toString() {
        return super.toString()+", ID Enfermeira: " + idEnfermeira + ", CRE: " + cre + ", Turno: " + turno+ ", Chefe: " + chefe;
    }

    public Integer getIdEnfermeira() {
        return idEnfermeira;
    }


    public String getCre() {
        return cre;
    }

    public Turno getTurno() {
        return turno;
    }

    public Enfermeira getChefe() {
        return chefe; 
    }

}
