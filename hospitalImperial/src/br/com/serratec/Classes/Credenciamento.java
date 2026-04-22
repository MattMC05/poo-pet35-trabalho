package br.com.serratec.Classes;
import java.time.LocalDate;

public class Credenciamento {
    private Integer Credenciamento;
    private LocalDate dataCredenciamento;
    private Integer PlanoSaude;
    private Integer Hospital;

    
    public Credenciamento(Integer credenciamento, LocalDate dataCredenciamento, Integer planoSaude, Integer hospital) {
        Credenciamento = credenciamento;
        this.dataCredenciamento = dataCredenciamento;
        PlanoSaude = planoSaude;
        Hospital = hospital;
    }


    public Integer getCredenciamento() {
        return Credenciamento;
    }


    public LocalDate getDataCredenciamento() {
        return dataCredenciamento;
    }


    public Integer getPlanoSaude() {
        return PlanoSaude;
    }


    public Integer getHospital() {
        return Hospital;
    }

    

}
