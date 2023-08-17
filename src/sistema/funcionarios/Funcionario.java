package sistema.funcionarios;

import sistema.funcionarios.enums.TipoFuncionario;

public class Funcionario {

    private static int proximoId = 1;
    private int id;
    private String nome;
    private double salario;
    private TipoFuncionario tipo;

    public Funcionario(String nome, double salario, TipoFuncionario tipo) {
        this.id = proximoId++;
        this.nome = nome;
        this.salario = salario;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public String informacaoFuncionario(){
        return "";
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Tipo: " + tipo);
        informacaoFuncionario();
    }
}
