package heranca;

public class TesteHeranca {

    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Smartphone", 999.99, "Samsung");
        Alimento fruta = new Alimento("Maçã", 2.49, "31/12/2023");

        System.out.println("Produto eletrônico: " + celular.getNome());
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Preço: $" + celular.getPreco());

        System.out.println("Produto alimentício: " + fruta.getNome());
        System.out.println("Data de validade: " + fruta.getDataValidade());
        System.out.println("Preço: $" + fruta.getPreco());
    }
}
