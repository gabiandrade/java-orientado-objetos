package quinta.aula.animais;

public class Cavalo extends Animal {

    public Cavalo(String nome) {
        super(nome);
    }

    @Override
    public void comer() {
        System.out.println("cavalo comendo");
    }

    @Override
    public void beberAgua() {
        System.out.println("bebendo agua");
    }

    @Override
    public void emitirSom() {
        System.out.println("cavalo emitindo som");
    }

}
