package br.com.serratec.Classes;

import java.time.LocalDate;

public class Internacao {
    private Integer Internacao;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Integer Leito;
    private Integer Atendimento;

    
    public Internacao(Integer internacao, LocalDate dataEntrada, LocalDate dataSaida, Integer leito,
            Integer atendimento) {
        Internacao = internacao;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        Leito = leito;
        Atendimento = atendimento;
    }


    public Integer getInternacao() {
        return Internacao;
    }


    public LocalDate getDataEntrada() {
        return dataEntrada;
    }


    public LocalDate getDataSaida() {
        return dataSaida;
    }


    public Integer getLeito() {
        return Leito;
    }


    public Integer getAtendimento() {
        return Atendimento;
    }

    

}
