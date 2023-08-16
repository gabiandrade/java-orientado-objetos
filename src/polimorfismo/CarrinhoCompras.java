package polimorfismo;

import heranca.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Produto> itens;

    public CarrinhoCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho:");
        for (Produto produto : itens) {
            System.out.println("- " + produto.getNome() + " - Preço: $" + produto.getPreco());
        }
    }

}
