package br.com.serratec.Classes;
import java.time.LocalDate;

public class Credenciamento {
    private Integer idCredenciamento ;
    private LocalDate dataCredenciamento;
    private PlanoSaude planoSaude;
    private Hospital hospital;

    public Credenciamento(Integer idCredenciamento, LocalDate dataCredenciamento, PlanoSaude planoSaude, Hospital hospital) {
        this.idCredenciamento = idCredenciamento;
        this.dataCredenciamento = dataCredenciamento;
        this.planoSaude = planoSaude;
        this.hospital = hospital;
    }
    
    @Override
    public String toString() {
        return "ID Credenciamento: " + idCredenciamento + ", Data de Credenciamento: " + dataCredenciamento
                + ", Plano de Saúde: " + planoSaude + ", Hospital: " + hospital;
    }

    public Integer getIdCredenciamento() {
        return idCredenciamento;
    }

    public LocalDate getDataCredenciamento() {
        return dataCredenciamento;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public Hospital getHospital() {
        return hospital;
    }

}
