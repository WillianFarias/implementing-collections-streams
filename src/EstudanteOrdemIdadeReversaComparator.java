import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante>{

  @Override
  public int compare(Estudante arg0, Estudante arg1) {
    return arg0.getAge() - arg1.getAge();
  }
  
}
