package br.com.ivanfsilva.loja.pedido.acao;

import br.com.ivanfsilva.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao( Pedido pedido ) {
        System.out.println("Salvando pedidos no banco de dados!");
    }
}
