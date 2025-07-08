package MetodoPagamento;

import Interfaces.IMetodoPagamento;

public class PagamentoBoleto implements IMetodoPagamento {
    @Override
    public boolean realizarPagamento(Double valorTotal) {
        System.out.println("Valor a ser pago: " + valorTotal);
        System.out.println("Aguardando pagamento do boleto....");

        // timer 5s
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Pagamento não compensado!!");
        return false;
    }
}
