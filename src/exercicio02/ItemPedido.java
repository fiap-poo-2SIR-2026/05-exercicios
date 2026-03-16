package exercicio02;

public class ItemPedido {
    String produto;
    double valor;
    int qtdComprada;

    public ItemPedido(String produto, double valor, int qtdComprada) {
        this.produto = produto;
        this.valor = valor;
        this.qtdComprada = qtdComprada;
    }

    public double totalParcial() {
        return valor * qtdComprada;
    }

}
