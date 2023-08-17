package sistema.funcionarios;

import java.util.ArrayList;

public class FuncionarioImplementacao {

    static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void getFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDetalhes();
        }
    }
}
