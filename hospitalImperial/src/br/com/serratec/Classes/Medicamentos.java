package br.com.serratec.Classes;

import java.time.LocalDate;

import br.com.serratec.Enums.UnidadeEnum;

public class Medicamentos {
    private Integer idMedicamentos;
    private String nome;
    private LocalDate data;
    private Double dosagem;
    private UnidadeEnum unidade;
    private Integer idAtendimento;//private Atendimeto atendimento  ??

    public Medicamentos(Integer idMedicamentos, String nome, LocalDate data, Double dosagem, UnidadeEnum unidade, Integer idAtendimento) {
        this.idMedicamentos = idMedicamentos;
        this.nome = nome;
        this.data = data;
        this.dosagem = dosagem;
        this.unidade = unidade;
        this.idAtendimento = idAtendimento;
    }

    public Integer getIdMedicamentos() {
        return idMedicamentos;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getDosagem() {
        return dosagem;
    }

    public UnidadeEnum getUnidade() {
        return unidade;
    }

    public Integer getIdAtendimento() {
        return idAtendimento;
    }
    
}
