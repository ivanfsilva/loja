package br.com.ivanfsilva.loja.model.orcamento.situacao;

import br.com.ivanfsilva.loja.model.DomainException;
import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento ){
        return BigDecimal.ZERO;
    }

    public void aprovar( Orcamento orcamento ) {
       throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprovar( Orcamento orcamento ) {
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finalizar( Orcamento orcamento ) {
        throw new DomainException("Orçamento não pode ser finalizado!");
    }
}
