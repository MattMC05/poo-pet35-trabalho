package Classes;

import java.security.Timestamp;

import Enums.ResultEx;

public class Exame {
    private Integer idExame;
    private Integer idLaboratorio;
    private Timestamp dataSolicitacaoResultado;
    private String tipo;
    private Double custo;
    private String descricaoDetalhada;
    private ResultEx resultado;
    private Byte[] laudo;
    private Integer idAtendimento;
    public Exame(Integer idExame, Integer idLaboratorio, Timestamp dataSolicitacaoResultado, String tipo, Double custo,
            String descricaoDetalhada, ResultEx resultado, Byte[] laudo, Integer idAtendimento) {
        this.idExame = idExame;
        this.idLaboratorio = idLaboratorio;
        this.dataSolicitacaoResultado = dataSolicitacaoResultado;
        this.tipo = tipo;
        this.custo = custo;
        this.descricaoDetalhada = descricaoDetalhada;
        this.ResultEx = ResultEx;
        this.laudo = laudo;
        this.idAtendimento = idAtendimento;
    }
    public Integer getIdExame() {
        return idExame;
    }
    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }
    public Integer getIdLaboratorio() {
        return idLaboratorio;
    }
    public void setIdLaboratorio(Integer idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
    public Timestamp getDataSolicitacaoResultado() {
        return dataSolicitacaoResultado;
    }
    public void setDataSolicitacaoResultado(Timestamp dataSolicitacaoResultado) {
        this.dataSolicitacaoResultado = dataSolicitacaoResultado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getCusto() {
        return custo;
    }
    public void setCusto(Double custo) {
        this.custo = custo;
    }
    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }
    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }
    public ResultEx getResultEx() {
        return ResultEx;
    }
    public void setResultEx(ResultEx resultado) {
        this.ResultEx = ResultEx;
    }
    public Byte[] getLaudo() {
        return laudo;
    }
    public void setLaudo(Byte[] laudo) {
        this.laudo = laudo;
    }
    public Integer getIdAtendimento() {
        return idAtendimento;
    }
    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }
   
}
