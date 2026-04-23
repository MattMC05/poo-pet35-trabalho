package br.com.serratec.Classes;

import br.com.serratec.Enums.LeitoEnum;
import br.com.serratec.Exceptions.LeitoMaxException;

public class Leito {

    private Integer idLeito;
    private LeitoEnum status;
    private Ala ala;

    public Leito(Integer idLeito, LeitoEnum status, Ala ala) {
        try {
            this.idLeito = idLeito;
            this.status = status;
            this.ala = ala;
            ala.alterLeitosDisponiveis(status);
        } catch (LeitoMaxException e) {
            System.err.println("Não foi possível gerar leito, leitos máximos atingidos");
        }
    }

    @Override
    public String toString() {
        return "ID Leito: " + idLeito + ", Status: " + status + ", Ala: " + ala;
    }

    public Integer getIdLeito() {
        return idLeito;
    }

    public LeitoEnum getStatus() {
        return status;
    }

    public Ala getAla() {
        return ala;
    }

}
