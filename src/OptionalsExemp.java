import java.util.Optional;

public class OptionalsExemp {
  public static void main(String[] args) {
    //possui dois estados: presente e vazio
    //tratamento para valores que podem ser nulos
    //operacao em valores que podem ser nulos sem se preocupar com nullpointexception

    Optional<String> optionalString = Optional.of("valor presente");

    System.out.println("Valor optional está presente");

    optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));
  }
}
