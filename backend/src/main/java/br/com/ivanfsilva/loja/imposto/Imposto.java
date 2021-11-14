package br.com.ivanfsilva.loja.imposto;

import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular( Orcamento orcamento );
}
