import java.util.Arrays;

public class ExemploLms {

    public static void main(String[] args) {

        String entrada = "_desc:_qtde:1_precoUnitario:_formaPgto:";


        String[] partes = entrada.split("_");
        //System.out.println(Arrays.toString(partes));
        for(String parte: partes) {
            String[] pedaco = parte.split(":");
            //System.out.println(Arrays.toString(pedaco));
            //System.out.println(pedaco[1]);
            if (pedaco.length == 2){
                String chave = pedaco[0];
                String valor = pedaco[1];

                if(chave.equals("nf")) {
                    int numeroNotaFiscal = Integer.parseInt(valor);
                } else {
                    int numeroNotaFiscal = 0;
                }
            }

            //chamar o construtor passando os atributos
            /*
            * NotaFiscal(numeroNotaFiscal, )
            *
            * */


        }


    }
}
