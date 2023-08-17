package sistema.funcionarios;

import sistema.funcionarios.enums.TipoFuncionario;

import java.util.Scanner;

public class Programa {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            Menu.exibirMenu();
            int escolha = scanner.nextInt();
            teste(escolha);

        }
    }

    static void teste(int escolha) {

        switch (escolha) {
            case 1 -> {

                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Tipo (GERENTE/OUTRO): ");
                TipoFuncionario tipo = TipoFuncionario.valueOf(scanner.next());
                scanner.nextLine();
                if (tipo == TipoFuncionario.GERENTE) {
                    System.out.print("Área: ");
                    String area = scanner.next();
                    FuncionarioImplementacao.adicionarFuncionario(new Gerente(nome, salario, area));
                } else {
                    FuncionarioImplementacao.adicionarFuncionario(new Funcionario(nome, salario, TipoFuncionario.OUTRO));
                }
            }
            case 2 -> FuncionarioImplementacao.getFuncionarios();
            case 3 -> {
                System.out.println("Saindo...");
                scanner.close();
                System.exit(0);
            }
            default -> System.out.println("Opção inválida");
        }
    }
}
