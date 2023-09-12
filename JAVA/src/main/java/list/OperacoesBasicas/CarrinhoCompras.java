package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras {

    private List<Items> itemsCarrinho;

    public CarrinhoCompras() {
        this.itemsCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemsCarrinho.add(new Items(nome, preco, quantidade));
        // Item item = new Item(nome, preco, quantidade);
        // this.itemsCarrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Items> itemsParaRemover = new ArrayList<>();
        if (!itemsCarrinho.isEmpty()) {
            for (Items i : itemsCarrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemsCarrinho.removeAll(itemsParaRemover);
        } else {
            System.out.println("Seu carrinho está vazio!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemsCarrinho.isEmpty()) {
            for (Items item : itemsCarrinho) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Seu carrinho está vazio!");
        }
    }

    public void exibirItens() {
        if (!itemsCarrinho.isEmpty()) {
            System.out.println(this.itemsCarrinho);
        } else {
            System.out.println("Seu carrinho está vazio!");
        }
    }

    @Override
    public String toString() {
        return "Carrinho de Compras {" + "ITEM: " + itemsCarrinho + "}";
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        // Adicionando itens ao carrinho
        carrinhoCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
    }
}