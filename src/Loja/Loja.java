package Loja;

import Interfaces.IMetodoPagamento;

public class Loja {
    private final IMetodoPagamento metodoPagamento;

    public Loja(IMetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarCompra(Carrinho carrinho) {
        ;

        //o mesmo que: metodoPagamento.realizarPagamento() == false
        if (!metodoPagamento.realizarPagamento(carrinho.calcularTotal())) {
            System.out.println("Falha na compra!!!");
        } else {
            System.out.println("Itens comprados:");
            carrinho.listarProdutos();
        }
    }
}

