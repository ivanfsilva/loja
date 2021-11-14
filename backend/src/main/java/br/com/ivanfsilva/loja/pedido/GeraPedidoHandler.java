package br.com.ivanfsilva.loja.pedido;

import br.com.ivanfsilva.loja.model.Orcamento;
import br.com.ivanfsilva.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.ivanfsilva.loja.pedido.acao.EnviarEmailPedido;
import br.com.ivanfsilva.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
