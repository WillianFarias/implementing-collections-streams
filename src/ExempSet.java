import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class ExempSet {
  
  public static void main(String[] args) {
    //Set

    //Por padrao nao garante ordem;
    //Nao permite itens repetidos
    //Nao permite mudanca de ordenacao
    //HashSet
    //TreeSet (arvore binaria)
    //LinkedHashSet

    Set<Double> notasAlunos = new HashSet<>();
    Iterator<Double> iterator = notasAlunos.iterator();

    notasAlunos.add(10.0);
    notasAlunos.add(11.2);
    
    for (Double notas : notasAlunos) {
      System.out.println(notas);
    }

    notasAlunos.isEmpty();

    notasAlunos.clear();
  }
}
