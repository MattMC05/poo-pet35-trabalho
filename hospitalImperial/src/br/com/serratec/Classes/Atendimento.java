package br.com.serratec.Classes;

import java.time.LocalDate;

import br.com.serratec.Enums.StatusAt;
import br.com.serratec.Enums.TipoAt;

public class Atendimento {
    private Integer idAtendimento;
    private LocalDate data;
    private TipoAt tipo;
    private StatusAt status;
    private String observacoes;
    private Medico medicoResponsavel;
    private Paciente pacienteAtendido;
   
    public Atendimento(Integer idAtendimento, LocalDate data, TipoAt tipo, StatusAt status, String observacoes,
            Medico medicoResponsavel, Paciente pacienteAtendido) {
        this.idAtendimento = idAtendimento;
        this.data = data;
        this.tipo = tipo;
        this.status = status;
        this.observacoes = observacoes;
        this.medicoResponsavel = medicoResponsavel;
        this.pacienteAtendido = pacienteAtendido;
    }
    
    @Override
    public String toString() {
        return "ID Atendimento: " + idAtendimento + ", Data: " + data + ", Tipo: " + tipo + ", Status: "
                + status + ", Observações: " + observacoes + ", Médico Responsável: " + medicoResponsavel
                + ", Paciente Atendido: " + pacienteAtendido;
    }

    public Integer getId_atendimento() {
        return idAtendimento;
    }

    public LocalDate getData() {
        return data;
    }

    public TipoAt getTipo() {
        return tipo;
    }

    public StatusAt getStatus() {
        return status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public Paciente getPacienteAtendido() {
        return pacienteAtendido;
    }
    
}