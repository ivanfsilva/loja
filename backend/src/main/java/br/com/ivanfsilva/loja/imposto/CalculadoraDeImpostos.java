package br.com.ivanfsilva.loja.imposto;

import br.com.ivanfsilva.loja.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular( Orcamento orcamento, Imposto imposto ) {
        return imposto.calcular(orcamento);
    }
}
