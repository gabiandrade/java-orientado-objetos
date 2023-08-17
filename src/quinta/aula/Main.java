package quinta.aula;

import quinta.aula.animais.Animal;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Douglas",
                "121212", "8215445",
                "6565655456");

        aluno.testePessoa();

        Pessoa pessoa = new Pessoa("fdsfsd", "fdsfsd", "fdsfds");
        pessoa.testePessoa();

        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao("fdsaf", "gsgsg");

        alunoPosGraduacao.testePessoa();


    }
}
