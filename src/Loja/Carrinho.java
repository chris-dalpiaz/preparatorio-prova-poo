package Loja;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();


    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void listarProdutos() {
        for (Produto p : this.listaProdutos) {
            System.out.println(p.getNome());
        }
    }

    public double calcularTotal(){
        Double valorTotalCarinho = 0.0;

        //somando o valor dos produtos do carrinho
        for (int i = 0; i < this.getListaProdutos().size(); i++) {
            valorTotalCarinho += this.getListaProdutos().get(i)
                    .getPreco();
        }
        return valorTotalCarinho;
    }

    public void addProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("O produto " + produto.getNome()
                + " foi adicionado com sucesso no carrinho!");
    }
}
