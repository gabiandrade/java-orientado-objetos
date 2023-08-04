package primeira.aula;

public class Main {

    public static void main(String[] args) {

        // Objeto - instancia da classe loja
        Loja magazineLuiza = new Loja();
        magazineLuiza.setNome("Magazine Luiza");

        Loja casasBahia = new Loja();
        casasBahia.setNome("Casas Bahia");
        casasBahia.setCidade("São Paulo");

        Loja amazon = new Loja("Amazon");

        // O java reconhece qual construtor você quer utilizar a partir do tipo de parametro
        Loja shein = new Loja("125478", "Shein");

        System.out.println(magazineLuiza);
        System.out.println(casasBahia);
        System.out.println(amazon);
        System.out.println(shein);

    }
}