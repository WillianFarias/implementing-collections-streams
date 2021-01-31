import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("*** " + iterator.next());
        }

        //limpa lista
        nomes.clear();

        //Veifica se o item existe na lista e retorna sua posicao
        int posicaoDoElemento = nomes.indexOf("Maria");

        //Queue a forma como java trata filas
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Willian");
        filaBanco.add("Maria");
        filaBanco.add("João");

        System.out.println(filaBanco);

        //Retira o primeiro elemento da fila
        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        //retorna primeiro elemento da fila, mas nao retira ele da fila, caso a
        //fila esteja vazia retorna null
        String primeiroElemento = filaBanco.peek();

        //retorna o primeiro elemento, caso esteja vazia retorna erro
        String primeiroElementoOuErro = filaBanco.element();
        //filaBanco.clear();
        System.out.println(primeiroElementoOuErro);

        Iterator<String> iteratorFila = filaBanco.iterator();

        while (iterator.hasNext()) {
            System.out.println("Iterator Fila: " + iteratorFila.next());
        }
        
    }
}
