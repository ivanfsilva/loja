package br.com.ivanfsilva.loja.imposto;

import br.com.ivanfsilva.loja.model.Orcamento;

import java.math.BigDecimal;

public class Icms implements Imposto {

    public BigDecimal calcular( Orcamento orcamento ) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
