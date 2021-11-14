package br.com.ivanfsilva.loja.imposto;

import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

import java.math.BigDecimal;

public class Iss extends Imposto {

    public Iss(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento ) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
