import Interfaces.IMetodoPagamento;
import Loja.Carrinho;
import Loja.Loja;
import Loja.Produto;
import MetodoPagamento.PagamentoBoleto;
import MetodoPagamento.PagamentoCartaoCredito;
import MetodoPagamento.PagamentoPIX;

public class Main {
    public static void main(String[] args) {
        IMetodoPagamento pix = new PagamentoPIX();
        IMetodoPagamento boleto = new PagamentoBoleto();
        IMetodoPagamento cartaoCredito = new PagamentoCartaoCredito();
        Loja loja1 = new Loja(cartaoCredito);
        Carrinho carinhoCompras = new Carrinho();

        Produto produto1 = new Produto("Computador Gamer",
                22000.0);
        Produto produto2 = new Produto("Notebook Profissional Plus",
                12000.0);
        Produto produto3 = new Produto("Limpa Telas Hightech 120ml",
                30.0);
        Produto produto4 = new Produto("Pincel Limpa Teclado Gamer",
                25.0);
        Produto produto5 = new Produto("Pano Limpa Telas", 10.0);

        //carinhoCompras.addProduto(produto1);
        //carinhoCompras.addProduto(produto2);
        //carinhoCompras.addProduto(produto3);
        carinhoCompras.addProduto(produto4);
        carinhoCompras.addProduto(produto5);

        loja1.realizarCompra(carinhoCompras);
    }
}