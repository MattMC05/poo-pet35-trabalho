package br.com.serratec.Classes;

import br.com.serratec.Enums.Turno;

public class Enfermeira extends Pessoa {
    private int idEnfermeira;
    private String cre;
    private Turno turno;
    private Enfermeira chefe;
    
    public Enfermeira(String nome, int idEnfermeira, String cre, Turno turno, Enfermeira chefe) {
        super(nome);
        this.idEnfermeira = idEnfermeira;
        this.cre = cre;
        this.turno = turno;
        this.chefe = chefe;
    }

    public int getIdEnfermeira() {
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


    @Override
    public String toString() {
        return "Enfermeira [idEnfermeira=" + idEnfermeira + ", nome=" + nome + ", cre=" + cre + ", turno=" + turno
                + ", chefe=" + chefe;
    }

    
    

    

}
