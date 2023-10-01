package loja;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemRemovido = new ArrayList<>();

        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemovido.add(i);
                }
            }
            carrinho.removeAll(itemRemovido);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularTotal(){
        double valorTotal = 0d;

        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
          }
    }    

    public void exibirCarrinho(){
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("Lista vazia!");
        }
    }

     


}