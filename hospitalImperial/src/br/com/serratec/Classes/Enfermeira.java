package br.com.serratec.Classes;

import br.com.serratec.Enums.Turno;

public class Enfermeira {
    private int idEnfermeira;
    private String nome;
    private String cre;
    private Turno turno;
    private Enfermeira chefe;
    

    public Enfermeira(int idEnfermeira, String nome, String cre, Turno turno, Enfermeira chefe) {
        this.idEnfermeira = idEnfermeira;
        this.nome = nome;
        this.cre = cre;
        this.turno = turno;
        this.chefe = chefe;
    }

    public int getIdEnfermeira() {
        return idEnfermeira;
    }

    public String getNome() {
        return nome;
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
