package terceira.aula.v1;

import java.util.ArrayList;

public class Shopping {
    private String nome;
    private ArrayList<Loja> lojas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public Shopping(String nome) {
        this.nome = nome;
    }

    public void adicionarLoja(Loja loja) {
        if (!verificarLojaPorNome(loja.getNome())) {
            lojas.add(loja);
            System.out.println("Loja cadastrada com sucesso!");
        } else {
            System.out.println("Loja já cadastrada");
        }
    }

    public ArrayList<Loja> exibirArrayLojas() {
        return lojas;
    }

    public void exibirTodasLojas() {
        for (Loja loja : lojas) {
            System.out.println("--------");
            loja.exibirInformacoes();
        }
    }

    public void buscarPorNome(String nome) {
        for (Loja loja : lojas) {
            if (loja.getNome().equalsIgnoreCase(nome)) {
                loja.exibirInformacoes();
            }
        }
    }

    private boolean verificarLojaPorNome(String nome) {
        for (Loja loja : lojas) {
            if (loja.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }


}
