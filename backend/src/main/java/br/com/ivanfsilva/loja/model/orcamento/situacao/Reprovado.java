package br.com.ivanfsilva.loja.model.orcamento.situacao;

import br.com.ivanfsilva.loja.model.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar( Orcamento orcamento ) {
        orcamento.setSituacao( new Finalizado() );
    }
}
