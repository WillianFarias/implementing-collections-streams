import java.util.ArrayList;
import java.util.List;

public class StreamApiExemp {
  public static void main(String[] args) {

    List<Estudante> estudante = new ArrayList<>();

    estudante.add(new Estudante("Willian", 29));
    estudante.add(new Estudante("Samanta", 25));
    estudante.add(new Estudante("Maria", 23));

    System.out.println("Menor número de letras: " + estudante.stream().min(
      Comparator.comparingInt(String::length)
    ));
    
  }
}
