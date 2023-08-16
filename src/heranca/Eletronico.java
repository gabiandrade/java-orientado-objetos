package heranca;

public class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String getInfoAdicional() {
        return "Marca: " + marca;
    }
}
