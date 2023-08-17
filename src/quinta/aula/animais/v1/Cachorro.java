package quinta.aula.animais.v1;

import quinta.aula.animais.Animal;

public class Cachorro extends Animal {

    //public Cachorro() {}

    public Cachorro(String raca, String nome, String cor) {
        // vira-lata, mel, marrom
        super(raca, nome, cor);
    }

    public void exibirInformacoes(){
        System.out.println("Nome do Cachorro: " + getNome());
        System.out.println("Raça do Cachorro: " + getRaca());
    }

    @Override
    public void comer(){
        System.out.println("Cachorro comendo ração");
    }

    @Override
    public void beberAgua() {
        System.out.println("bebendo");
    }

    public void comer(String racao){
        System.out.println("Cachorro comendo ração");
    }

    public void comer(String valor1, int valor2, String valor3){
        System.out.println("Cachorro comendo ração");
    }
}
