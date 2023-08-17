package polimorfismo;

import heranca.Alimento;
import heranca.Eletronico;
import heranca.Produto;

public class TestePolimorfismo {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        Produto celular = new Eletronico("Smartphone", 999.99, "Samsung");
        Alimento fruta = new Alimento("Maçã", 2.49, "31/12/2023");


        carrinho.adicionarProduto(celular);
        carrinho.adicionarProduto(fruta);
        //carrinho.exibirItens();
        System.out.println();


        Produto produto1 = new Eletronico("TV", 999.99, "Samsung");
        Produto produto2 = new Alimento("Banana", 4.49, "31/12/2023");

        System.out.println(produto1);
        System.out.println();
        System.out.println(produto2);
    }

}
