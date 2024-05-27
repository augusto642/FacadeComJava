package Facade;
import Subsistemas.*;

public class SistemaCompraOnline {
    private CarrinhoDeCompras carrinhoDeCompras;
    private ProcessamentoPagamento processamentoPagamento;
    private EnvioEmail envioEmail;

    public SistemaCompraOnline() {
        carrinhoDeCompras = new CarrinhoDeCompras();
        processamentoPagamento = new ProcessamentoPagamento();
        envioEmail = new EnvioEmail();
    }

    public void realizarCompra(String[] itens, int[] quantidades, double valorTotal, String email) {
        for (int i = 0; i < itens.length; i++) {
            carrinhoDeCompras.adicionarItem(itens[i], quantidades[i]);
        }
        processamentoPagamento.processarPagamento(valorTotal);
        carrinhoDeCompras.finalizarCompra();
        envioEmail.enviarConfirmacaoCompra(email);
    }
}
