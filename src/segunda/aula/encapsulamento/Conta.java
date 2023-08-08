package segunda.aula.encapsulamento;

public class Conta {
    private String nome;
    private String numeroConta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (saldo < 0.0 || valor > saldo) {
            System.out.println("Saldo insuficiente");
        }
        if(!verificarNotasDisponiveisCaixa()) {
            System.out.println("Notas insuficientes");
        }

        this.saldo = saldo - valor;
    }

    private Boolean verificarNotasDisponiveisCaixa() {
        double valorTotalEmCaixa = 10000.00;
        if (valorTotalEmCaixa > 0.0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
