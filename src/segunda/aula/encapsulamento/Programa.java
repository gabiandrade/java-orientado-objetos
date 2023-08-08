package segunda.aula.encapsulamento;

public class Programa {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNome("Pedro");
        conta.setNumeroConta("12543");
        conta.depositar(10000.00);
        System.out.println(conta);

        conta.sacar(4500);
        System.out.println(conta);


    }
}
