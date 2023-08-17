package quinta.aula;

public class Aluno extends Pessoa {
    private double[] notas;
    private String matricula;

    public Aluno(String nome, String cpf, String telefone,
                 String matricula) {
        super(nome, cpf, telefone);
        this.matricula = matricula;
    }

    public Aluno(String nome, String cpf){
        super(nome, cpf);
    }

    public void testePessoa() {
        System.out.println("Teste aluno");
    }

}
