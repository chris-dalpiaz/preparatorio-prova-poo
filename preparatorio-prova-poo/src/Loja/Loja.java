package Loja;

import Interfaces.IMetodoPagamento;

public class Loja {
    private final IMetodoPagamento metodoPagamento;

    public Loja(IMetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarCompra(Carrinho carrinho) {
        double valorTotalCarinho = 0.0;

        //somando o valor dos produtos do carrinho
        for (int i = 0; i < carrinho.getListaProdutos().size(); i++) {
            valorTotalCarinho += carrinho.getListaProdutos().get(i)
                    .getPreco();
        }

        //o mesmo que: metodoPagamento.realizarPagamento() == false
        if (!metodoPagamento.realizarPagamento(valorTotalCarinho)) {
            System.out.println("Falha na compra!!!");
        } else {
            System.out.println("Itens comprados:");
            carrinho.listarProdutos();
        }
    }
}

