package br.com.ivanfsilva.loja.pedido.acao;

import br.com.ivanfsilva.loja.pedido.Pedido;

public class EnviarEmailPedido {

    public void executar( Pedido pedido ) {
        System.out.println("Enviando email com dados do Pedido!");
    }
}
