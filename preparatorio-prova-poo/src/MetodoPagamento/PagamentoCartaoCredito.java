package MetodoPagamento;

import Interfaces.IMetodoPagamento;

public class PagamentoCartaoCredito implements IMetodoPagamento {
    @Override
    public boolean realizarPagamento(Double valorTotal) {
        double limiteParaAprovacao = 1000;

        System.out.println("Valor a ser pago: " + valorTotal);
        System.out.println("Aguardando pagamento....");

        // timer 5s
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (valorTotal < limiteParaAprovacao) {
            System.out.println("Pagamento realizado com sucesso!");
            return true;
        } else {
            System.out.println("Pagamento negado!! " +
                    "Valor superior ao suportado!\n" +
                    "Limite para aprovação: " + limiteParaAprovacao);
            return false;
        }
    }
}
