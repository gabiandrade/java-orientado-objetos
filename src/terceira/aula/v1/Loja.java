package terceira.aula.v1;

public class Loja {
    public String nome;
    private String categoria;
    private String piso;
    private String horarioFuncionamento;

    public Loja(){}

    public Loja(String nome, String categoria,
                String piso, String horarioFuncionamento) {
        this.nome = nome;
        this.categoria = categoria;
        this.piso = piso;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Piso: " + piso);
        System.out.println("Horário de Funcionamento: " + horarioFuncionamento);
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", piso='" + piso + '\'' +
                ", horarioFuncionamento='" + horarioFuncionamento + '\'' +
                '}';
    }
}
