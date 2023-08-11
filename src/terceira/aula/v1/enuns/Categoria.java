package terceira.aula.v1.enuns;

public enum Categoria {

    PERFUMARIA("Perfumaria"),
    ALIMENTOS("Alimentos"),
    CASA_DECORACAO("Casa/Decoracao"),
    ROUPAS("Roupas"),
    CALCADOS("Calçados");


    private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
