package br.com.serratec.Interfaces;

import java.math.BigDecimal;

public interface ImpostosInterface  {
    public BigDecimal calcularIss();
    public BigDecimal calcularPis();
    public BigDecimal calcularCofins();
    public BigDecimal calcularIrpj();
    public BigDecimal calcularCsll();
    public BigDecimal somaImpostos();
}
