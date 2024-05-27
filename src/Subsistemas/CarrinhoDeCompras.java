package Subsistemas;

public class CarrinhoDeCompras {
    public void adicionarItem(String item, int quantidade) {
        System.out.println("Adicionando " + quantidade + "x " + item + " ao carrinho de compras");
    }

    public void removerItem(String item, int quantidade) {
        System.out.println("Removendo " + quantidade + "x " + item + " do carrinho de compras");
    }

    public void finalizarCompra() {
        System.out.println("Finalizando compra...");
    }
}
