package br.com.ivanfsilva.loja.model;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar( Orcamento orcamento ) {
        orcamento.setSituacao( new Finalizado() );
    }
}
