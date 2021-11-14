package br.com.ivanfsilva.loja.imposto;

import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento );

    public BigDecimal calcular( Orcamento orcamento ) {
        BigDecimal valorImposto = realizarCalculo( orcamento );

        BigDecimal valordoOutroImposto = BigDecimal.ZERO;

        if ( outro != null ) {
            valordoOutroImposto = outro.realizarCalculo( orcamento );
        }

        return valorImposto.add( valordoOutroImposto );
    };
}
