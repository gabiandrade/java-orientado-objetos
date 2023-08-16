package polimorfismo;

import heranca.Alimento;
import heranca.Eletronico;
import heranca.Produto;

public class ExemploInstanceOf {

    public static void main(String[] args) {
        Produto produto1 = new Eletronico("Smartphone", 999.99, "Samsung");
        Produto produto2 = new Alimento("Maçã", 2.49, "31/12/2023");

        System.out.println("Produto 1: " + produto1.getNome());
        if (produto1 instanceof Eletronico) {
            Eletronico eletronico = (Eletronico) produto1;
            System.out.println("Marca: " + eletronico.getMarca());
        }
        System.out.println("Preço: $" + produto1.getPreco());

        System.out.println("\nProduto 2: " + produto2.getNome());
        if (produto2 instanceof Alimento) {
            Alimento alimento = (Alimento) produto2;
            System.out.println("Data de validade: " + alimento.getDataValidade());
        }
        System.out.println("Preço: $" + produto2.getPreco());
    }

}
