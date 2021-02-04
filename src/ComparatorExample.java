import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
  public static void main(String[] args) {
    List<Estudante> estudantes = new ArrayList<>();

    estudantes.add(new Estudante("Willian", 29));
    estudantes.add(new Estudante("Samanta", 25));
    estudantes.add(new Estudante("Maria", 23));

    System.out.println(estudantes);

    estudantes.sort((first, second) -> first.getAge() - second.getAge());

    System.out.println(estudantes);

    estudantes.sort(Comparator.comparingInt(Estudante::getAge).reversed());

    System.out.println(estudantes);
  }
}
