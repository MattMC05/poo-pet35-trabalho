package br.com.serratec.Classes;

import br.com.serratec.Enums.LeitoEnum;
import br.com.serratec.Exceptions.LeitoMaxException;

public class Ala {

    private Integer idAla;
    private Enfermeira enfermeiraResponsavel;
    private String tipo;
    private static Integer leitosDisponiveis=20;//Quantidade de Leitos = ?
    private Hospital hospital;

    public Ala(Enfermeira enfermeiraResponsavel, String tipo, Hospital hospital) {
        this.enfermeiraResponsavel = enfermeiraResponsavel;
        this.tipo = tipo;
        this.hospital = hospital;
    }
    @Override
    public String toString() {
        return "ID Ala: " + idAla + ", Enfermeira Responsável: " + enfermeiraResponsavel + ", Tipo: " + tipo +", Hospital: " + hospital;
    }

    public Integer getIdAla() {
        return idAla;
    }

    public Enfermeira getenfermeiraResponsavel() {
        return enfermeiraResponsavel;
    }
   
    public String getTipo() {
        return tipo;
    }

    public Integer getLeitosDisponiveis() {
        return leitosDisponiveis;
    }

    public void alterLeitosDisponiveis(LeitoEnum statusLeito) {
        if (leitosDisponiveis==0) {
            throw new LeitoMaxException();
        }
        if (statusLeito==LeitoEnum.OCUPADO || statusLeito==LeitoEnum.EM_MANUTENCAO) {
            leitosDisponiveis-=1;
        }
    }

    public Hospital getHospital() {
        return hospital;
    }

}
