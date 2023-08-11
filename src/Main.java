import terceira.aula.v1.Loja;
import terceira.aula.v1.Shopping;
import terceira.aula.v1.enuns.Categoria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shopping shopping = new Shopping("JAVEM");

        System.out.println("Bem vindo ao Shopping " + shopping.getNome());

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1 - Cadastrar Loja");
            System.out.println("2 - Exibir todas as lojas");
            System.out.println("3 - Pesquisar loja por nome");
            System.out.println("4 - Sair");
            System.out.println("----------------------------------");

            System.out.println("Digite o numero da opção desejada: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("--- Cadastro de Loja ---");

                    System.out.println("Digite o nome da loja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a categoria da loja (Perfumaria):");
                    String categoria = scanner.nextLine();
                    System.out.println("Digite o piso da loja: ");
                    String piso = scanner.nextLine();
                    System.out.println("Digite o horário de funcionamento da loja: ");
                    String horarioFuncionamento = scanner.nextLine();

                    Loja loja = new Loja();
                    loja.setNome(nome);

                    if (categoria.equals(Categoria.PERFUMARIA.getDescricao())) {
                        loja.setCategoria(Categoria.PERFUMARIA);
                    }
                    loja.setPiso(piso);
                    loja.setHorarioFuncionamento(horarioFuncionamento);
                    shopping.adicionarLoja(loja);
                    break;
                case 2:
                    shopping.exibirTodasLojas();
                    break;
                case 3:
                    System.out.println("Qual loja você está procurando");
                    String nomeLoja = scanner.nextLine();
                    shopping.buscarPorNome(nomeLoja);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opção não encontrada. Por favor, " +
                            "digite uma opção válida");
                    break;
            }
        }

    }
}
