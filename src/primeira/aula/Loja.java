package primeira.aula;
public class Loja {

    //atributos - caracteristicas do objeto
    private String nome;
    private String cnpj;
    private int quantidadeFuncionarios;
    private String produtos;
    private String rua;
    private int numeroLoja;
    private String bairro;
    private String cidade;
    private String estado;

    //construtor default da classe
    public Loja() {
    }

    //construtor que recebe só o nome por parametro
    public Loja(String nome) {
        this.nome = nome;
    }

    //construtor que recebe cnpj e nome por parametro
    public Loja(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    public void listarProdutos() {
        System.out.println("listando produtos");
    }

    //Metodo toString imprime os dados do objeto
    @Override
    public String toString() {
        return "Loja = [" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", rua='" + rua + '\'' +
                ", numeroLoja='" + numeroLoja + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ']';
    }
}
