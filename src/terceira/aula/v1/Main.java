package terceira.aula.v1;

public class Main {

    public static void main(String[] args) {
        Shopping shopping = new Shopping("Javem");

        Loja loja = new Loja("ADA", "Vestuario",
                "Terreo", "19hrs às 22hrs");

        Loja loja1 = new Loja("Turma 1002 loja 1", "Vestuario",
                "Terreo", "19hrs às 22hrs");

        shopping.adicionarLoja(loja);
        shopping.adicionarLoja(loja1);
        shopping.buscarPorNome("ada");
    }
}
