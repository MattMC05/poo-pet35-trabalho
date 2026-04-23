package br.com.serratec.Classes;

import java.time.LocalDate;

public class Internacao {
    private Integer Internacao;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Leito leito;
    private Atendimento atendimento;


    public Internacao(Integer internacao, LocalDate dataEntrada, LocalDate dataSaida, Leito leito,
            Atendimento atendimento) {
        Internacao = internacao;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.leito = leito;
        this.atendimento = atendimento;

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


    public Leito getLeito() {
        return leito;
    }


    public Atendimento getAtendimento() {
        return atendimento;
    }

    

    
    
    

}
