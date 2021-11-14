package br.com.ivanfsilva.loja.desconto;

import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular( Orcamento orcamento ) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular( orcamento );
    }
}
