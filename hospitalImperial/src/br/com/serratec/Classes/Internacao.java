package br.com.serratec.Classes;

import java.time.LocalDate;

public class Internacao {
    private Integer idInternacao;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Leito leito;
    private Atendimento atendimento;

    public Internacao(Integer idInternacao, LocalDate dataEntrada, LocalDate dataSaida, Leito leito,
            Atendimento atendimento) {
        this.idInternacao = idInternacao;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.leito = leito;
        this.atendimento = atendimento;
    }

    @Override
    public String toString() {
        return "ID Internação: " + idInternacao + ", Data de Entrada: " + dataEntrada + ", Data de Saída: "
            + dataSaida+ ", Leito: " + leito + ", Atendimento: " + atendimento;
    }

    public Integer getIdInternacao() {
        return idInternacao;
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
