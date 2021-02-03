import java.util.HashSet;
import java.util.Set;

public class ExempSet {
  
  public static void main(String[] args) {
    //Set

    //Por padrao nao garante ordem;
    //Nao permite itens repetidos
    //Nao permite mudanca de ordenacao
    //HashSet
    //TreeSet
    //LinkedHashSet

    Set<Double> notasAlunos = new HashSet<>();
    notasAlunos.add(10.0);
    notasAlunos.add(11.2);

    notasAlunos.clear();
  }
}
