package segunda.aula;

public class Calculadora {

    public static void main(String[] args) {

        int resultadoSoma = Soma.somar(5,2,5);
        int resultadoSubtracao = Subtracao.subtrair(48,7);
        int resultadoMultiplicacao = Multiplicacao.multiplicar(4,9);
        int resultadoDivisao = Divisao.dividir(9,3);

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);
    }

}
