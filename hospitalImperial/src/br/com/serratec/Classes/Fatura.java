package br.com.serratec.Classes;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.serratec.Enums.StatusFaEnum;

public class Fatura {
    private Integer idFatura;
    private BigDecimal valor;
    private String formaPagamento;
    private StatusFaEnum status;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    //private Atendimento atendimento;
    //private Internacao internacao;
    //private Exame exame;
    private Integer idAtendimento;
    private Integer idInternacao;
    private Integer idExame;

    

    /*public Fatura(Integer idFatura, BigDecimal valor, String formaPagamento, LocalDate dataEmissao,
            LocalDate dataVencimento) {
        this.idFatura = idFatura;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
    }*/

    public Fatura(Integer idFatura, BigDecimal valor, String formaPagamento, StatusFaEnum status, LocalDate dataEmissao,
            LocalDate dataVencimento, Integer idAtendimento, Integer idInternacao, Integer idExame) {
        this.idFatura = idFatura;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.status = status;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.idAtendimento = idAtendimento;
        this.idInternacao = idInternacao;
        this.idExame = idExame;
    }

    public Fatura(Integer idFatura, BigDecimal valor, String formaPagamento, LocalDate dataEmissao,
            LocalDate dataVencimento, Integer idAtendimento, Integer idInternacao, Integer idExame) {
        this.idFatura = idFatura;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.idAtendimento = idAtendimento;
        this.idInternacao = idInternacao;
        this.idExame = idExame;
    }

    /*@Override
    public String toString() {
        return "ID Fatura: " + idFatura + ", Valor: " + valor + ", Forma de Pagamento: " + formaPagamento + ", Status: "
                + status + ", Data de Emissão: " + dataEmissao + ", Data de Vencimento: " + dataVencimento + ", Atendimento: "
                + atendimento + ", Internação: " + internacao + ", Exame: " + exame;
    }*/
   @Override
    public String toString() {
        return "ID Fatura: " + idFatura + ", Valor da Fatura: " + valor + ", Forma de Pagamento: " + formaPagamento + ", Status: "
                + status + ", Data de Emissão: " + dataEmissao + ", Data de Vencimento: " + dataVencimento + ", Atendimento: "
                + idAtendimento + ", Internação: " + idInternacao + ", Exame: " + idExame;
    }

    public Integer getIdFatura() {
        return idFatura;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public StatusFaEnum getStatus() {
        return status;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public Integer getIdInternacao() {
        return idInternacao;
    }

    public Integer getIdExame() {
        return idExame;
    }
    
    /*
    public Atendimento getAtendimento() {
        return atendimento;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public Exame getExame() {
        return exame;
    }
    */
}
