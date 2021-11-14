package br.com.ivanfsilva.loja.pedido.acao;

import br.com.ivanfsilva.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao( Pedido pedido ) {
        System.out.println("Enviando email com dados do Pedido!");
    }
}
