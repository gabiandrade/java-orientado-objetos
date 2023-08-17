package heranca;

public class Alimento extends Produto {

    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void teste(){

    }

    @Override
    public String getInfoAdicional() {
        return "Data de validade: " + dataValidade;
    }
}
