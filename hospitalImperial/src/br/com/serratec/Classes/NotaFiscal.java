package br.com.serratec.Classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.serratec.Interfaces.ImpostosInterface;

public class NotaFiscal implements ImpostosInterface{
    private Integer idNota;
    private String nomeEmissor;
    private String descricao;
    private BigDecimal valorNota;
    private BigDecimal iss;
    private BigDecimal pis;
    private BigDecimal cofins;
    private BigDecimal irpj;
    private BigDecimal csll;
    private Fatura fatura;
    private Integer idFatura;

    public NotaFiscal(Integer idNota, String nomeEmissor, String descricao, Fatura fatura) {
        this.idNota = idNota;
        this.nomeEmissor = nomeEmissor;
        this.descricao = descricao;
        this.fatura = fatura;
        this.valorNota = valorDaNota().setScale(2, RoundingMode.HALF_UP);
        this.iss = calcularIss().setScale(2, RoundingMode.HALF_UP);
        this.pis = calcularPis().setScale(2, RoundingMode.HALF_UP);
        this.cofins = calcularCofins().setScale(2, RoundingMode.HALF_UP);
        this.irpj = calcularIrpj().setScale(2, RoundingMode.HALF_UP);
        this.csll = calcularCsll().setScale(2, RoundingMode.HALF_UP);
    }

    public NotaFiscal(Integer idNota, String nomeEmissor, String descricao, BigDecimal valorNota, BigDecimal iss,
            BigDecimal pis, BigDecimal cofins, BigDecimal irpj, BigDecimal csll, Integer idFatura) {
        this.idNota = idNota;
        this.nomeEmissor = nomeEmissor;
        this.descricao = descricao;
        this.valorNota = valorNota;
        this.iss = iss;
        this.pis = pis;
        this.cofins = cofins;
        this.irpj = irpj;
        this.csll = csll;
        this.idFatura = idFatura;
    }

    @Override
    public String toString() {
        return "ID Nota: " + idNota + ", Nome Emissor: " + nomeEmissor + ", Descrição: " + descricao
                + ", Valor da Nota: " + valorNota + ", ISS: " + iss + ", PIS: " + pis + ", COFINS: " + cofins + ", IRPJ: " + irpj
                + ", CSLL: " + csll + ", " + fatura;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public BigDecimal getIss() {
        return iss;
    }

    public BigDecimal getPis() {
        return pis;
    }

    public BigDecimal getCofins() {
        return cofins;
    }

    public BigDecimal getIrpj() {
        return irpj;
    }

    public BigDecimal getCsll() {
        return csll;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public BigDecimal getValorNota() {
        return valorNota;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getIdFatura() {
        return idFatura;
    }

    @Override
    public BigDecimal somaImpostos() {
        return calcularIss().add(calcularPis().add(calcularCofins().add(calcularIrpj().add(calcularCsll()))));
    }

    @Override
    public BigDecimal calcularIss() {
        return fatura.getValor().multiply(new BigDecimal(0.03));
    }

    @Override
    public BigDecimal calcularPis() {
        return fatura.getValor().multiply(new BigDecimal(0.0065));
    }

    @Override
    public BigDecimal calcularCofins() {
        return fatura.getValor().multiply(new BigDecimal(0.03));
    }

    @Override
    public BigDecimal calcularIrpj() {
        return fatura.getValor().multiply(new BigDecimal(0.012));
    }

    @Override
    public BigDecimal calcularCsll() {
        return fatura.getValor().multiply(new BigDecimal(0.0108));
    }

    public BigDecimal valorDaNota(){
        return fatura.getValor().add(somaImpostos());
    }

    
 
}
