package Classes;

import java.security.Timestamp;

import Enums.StatusAt;
import Enums.TipoAt;

public class Atendimento {
    private Integer id_atendimento;
    private Timestamp data;
    private TipoAt tipo;
    private StatusAt status;
    private String observacoes;
    private Medico medicoResponsavel;
    private Paciente pacienteAtendido;
   
    public Atendimento(Integer id_atendimento, Timestamp data, TipoAt tipo, StatusAt status, String observacoes,
            Medico medicoResponsavel, Paciente pacienteAtendido) {
        this.id_atendimento = id_atendimento;
        this.data = data;
        this.tipo = tipo;
        this.status = status;
        this.observacoes = observacoes;
        this.medicoResponsavel = medicoResponsavel;
        this.pacienteAtendido = pacienteAtendido;
    }

    public Integer getId_atendimento() {
        return id_atendimento;
    }

    public Timestamp getData() {
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

    @Override
    public String toString() {
        return "Atendimento [id_atendimento=" + id_atendimento + ", data=" + data + ", tipo=" + tipo + ", status="
                + status + ", observacoes=" + observacoes + ", medicoResponsavel=" + medicoResponsavel
                + ", pacienteAtendido=" + pacienteAtendido + "]";
    }

    
    
}