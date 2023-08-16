package heranca;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getInfoAdicional() {
        return "Produto Genérico"; // Método base, pode ser sobrescrito nas subclasses
    }


    @Override
    public String toString() {
        return "Produto: " + nome + "\n" + getInfoAdicional() + "\n" + "Preço: $" + preco;
    }
}
