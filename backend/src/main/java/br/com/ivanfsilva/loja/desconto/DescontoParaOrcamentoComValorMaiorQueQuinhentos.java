package br.com.ivanfsilva.loja.desconto;

import br.com.ivanfsilva.loja.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos( Desconto proximo ) {
        super( proximo );
    }

    public BigDecimal efetuarCalculo( Orcamento orcamento ) {
        return orcamento.getValor().multiply( new BigDecimal("0.05" ) );
    }

    @Override
    public boolean deveAplicar( Orcamento orcamento ) {
        return orcamento.getValor().compareTo( new BigDecimal( "500" ) ) > 0 ;
    }

}
