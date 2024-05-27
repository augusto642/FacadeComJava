import Facade.SistemaCompraOnline;

public class Main {
    public static void main(String[] args) {
        SistemaCompraOnline sistemaCompra = new SistemaCompraOnline();

        String[] itens = {"Livro", "Camiseta", "Computador"};
        int[] quantidades = {2, 1, 1};
        double valorTotal = 1500.0;
        String email = "cliente@example.com";

        sistemaCompra.realizarCompra(itens, quantidades, valorTotal, email);
    }
}
