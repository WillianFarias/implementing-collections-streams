import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> nomes = new ArrayList<>();

        nomes.add("Willian");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Carlos");
        nomes.add("Maria");

        System.out.println(nomes);
        //ordenando lista de nomes
        Collections.sort(nomes);

        //Lista ordenada
        System.out.println(nomes);

        //Alterando conteudo da lista na posicao dois
        nomes.set(2, "Larrisa");

        //Removendo elemento da posicao 2
        nomes.remove(2);

        //Caso Willian exista na lista ele sera eliminado da mesma
        nomes.remove("Willian");

        //Capturando valor do primeiro elemento da lista
        String nome = nomes.get(1);

        //retornando tamanho da lista
        int tamanho = nomes.size();

        //verifica se a lista possui determinado elemento
        boolean tem = nomes.contains("Willian");

        //Verifica se lista é vazia
        boolean vazia = nomes.isEmpty();

        //limpa lista
        nomes.clear();

        //Veifica se o item existe na lista e retorna sua posicao
        int posicaoDoElemento = nomes.indexOf("Maria");

    }
}
