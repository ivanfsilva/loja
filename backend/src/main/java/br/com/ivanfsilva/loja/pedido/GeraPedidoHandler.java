package br.com.ivanfsilva.loja.pedido;

import br.com.ivanfsilva.loja.model.Orcamento;
import br.com.ivanfsilva.loja.pedido.acao.EnviarEmailPedido;
import br.com.ivanfsilva.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // injecao de dependencias para servicos de infra
    public GeraPedidoHandler() {
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        // utilizacao dos servicos de infra
        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        email.executar(pedido);
        salvar.executar(pedido);
    }
}
