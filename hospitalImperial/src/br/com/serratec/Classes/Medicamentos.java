package br.com.serratec.Classes;

import java.time.LocalDate;

import br.com.serratec.Enums.UnidadeEnum;

public class Medicamentos {
    private Integer idMedicamentos;
    private String nome;
    private LocalDate data;
    private Double dosagem;
    private UnidadeEnum unidade;
    private Atendimento atendimento;

    public Medicamentos(Integer idMedicamentos, String nome, LocalDate data, Double dosagem, UnidadeEnum unidade,
            Atendimento atendimento) {
        this.idMedicamentos = idMedicamentos;
        this.nome = nome;
        this.data = data;
        this.dosagem = dosagem;
        this.unidade = unidade;
        this.atendimento = atendimento;
    }

    @Override
    public String toString() {
        return "ID Medicamentos: " + idMedicamentos + ", Nome: " + nome + ", Data da Prescrição: " + data
                + ", Dosagem: " + dosagem + ", Unidade de Medida: " + unidade + ", Atendimento: " + atendimento;
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

    public Atendimento getAtendimento() {
        return atendimento;
    }
    
}
