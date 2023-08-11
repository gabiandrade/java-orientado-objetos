package quarta.aula.enuns;

public enum DiasSemana {

    DOMINGO(1,"Domingo"),
    SEGUNDA(2, "Segunda"),
    TERCA(3, "Terça"),
    QUARTA(4, "Quarta"),
    QUINTA(5, "Quinta"),
    SEXTA(6, "Sexta"),
    SABADO(7, "Sábado");

    private final int id;
    private final String descricao;
    DiasSemana(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }
}
