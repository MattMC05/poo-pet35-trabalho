package br.com.serratec.Classes;

import java.io.File;
import java.time.LocalDate;

import br.com.serratec.Enums.ResultEx;

public class Exame {
    private Integer idExame;
    private Laboratorio laboratorio;
    private LocalDate dataSolicitacaoResultado;
    private String tipo;
    private Double custo;
    private String descricaoDetalhada;
    private ResultEx resultado;
    private File laudo;//???
    private Atendimento atendimentoRealizado;

    public Exame(Integer idExame, Laboratorio laboratorio, LocalDate dataSolicitacaoResultado, String tipo,
            Double custo, String descricaoDetalhada, ResultEx resultado, Atendimento atendimentoRealizado) {
        this.idExame = idExame;
        this.laboratorio = laboratorio;
        this.dataSolicitacaoResultado = dataSolicitacaoResultado;
        this.tipo = tipo;
        this.custo = custo;
        this.descricaoDetalhada = descricaoDetalhada;
        this.resultado = resultado;
        this.atendimentoRealizado = atendimentoRealizado;
    }

    @Override
    public String toString() {
        return "ID Exame: " + idExame + ", Laboratório: " + laboratorio + ", Data da Solicitação do Resultado: "
                + dataSolicitacaoResultado + ", Tipo: " + tipo + ", Custo: " + custo + ", Descrição Detalhada: "
                + descricaoDetalhada + ", Resultado: " + resultado /*+", Laudo: " + laudo*/ + ", Atendimento Realizado: "
                + atendimentoRealizado;
    }

    public Integer getIdExame() {
        return idExame;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public LocalDate getDataSolicitacaoResultado() {
        return dataSolicitacaoResultado;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCusto() {
        return custo;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public ResultEx getResultado() {
        return resultado;
    }

    public File getLaudo() {
        return laudo;
    }

    public Atendimento getAtendimento() {
        return atendimentoRealizado;
    }
   
}
