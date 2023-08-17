package quinta.aula;

public class AlunoPosGraduacao extends Aluno {
    public AlunoPosGraduacao(String nome, String cpf, String telefone, String matricula) {
        super(nome, cpf, telefone, matricula);
    }

    public AlunoPosGraduacao(String nome, String cpf) {
        super(nome, cpf);
    }

    public void testePessoa() {
        System.out.println("Teste aluno Pos");
    }
}
