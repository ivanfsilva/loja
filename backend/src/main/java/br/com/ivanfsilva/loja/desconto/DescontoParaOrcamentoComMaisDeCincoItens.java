package br.com.ivanfsilva.loja.desconto;

import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItens( Desconto proximo ) {
        super( proximo );
    }

    public BigDecimal efetuarCalculo( Orcamento orcamento ) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar( Orcamento orcamento ) {
        return orcamento.getQuantidadeItens() > 5;
    }

}
