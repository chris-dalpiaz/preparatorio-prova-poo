package MetodoPagamento;

import Interfaces.IMetodoPagamento;

public class PagamentoPIX implements IMetodoPagamento {

    @Override
    public boolean realizarPagamento(Double valorTotal) {
        System.out.println("Valor a ser pago: " + valorTotal);
        System.out.println("Aguardando pagamento....");

        // timer 5s
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Pagamento compensado com sucesso!");

        return true;
    }
}
