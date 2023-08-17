package quinta.aula.animais;

public class Animal {

    private String raca;
    private String nome;
    private String cor;


    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(String raca, String nome, String cor) {
        this.raca = raca;
        this.nome = nome;
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer(){
        System.out.println("Animal comendo");
    }
    public void beberAgua(){
        System.out.println("Animal bebendo agua");
    }
    public void emitirSom(){
        System.out.println("Animal emitindo som");
    }


    public void comer(String valor){
        System.out.println("Animal comendo");
    }


    //metodo especifico do cavalo - forma que ele está é de um animal

    @Override
    public String toString() {
        return "Animal{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
