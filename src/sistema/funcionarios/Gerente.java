package sistema.funcionarios;

import sistema.funcionarios.enums.TipoFuncionario;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, double salario, String area) {
        super(nome, salario, TipoFuncionario.GERENTE);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String informacaoFuncionario() {
        return "Área: " + area;
    }
}
