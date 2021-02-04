import java.util.HashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map;

public class ExempMap {
  public static void main(String[] args) {
    
    //entrada de chave valor
    //permite valores repetidos, mas nao permite chaves repetidas

    Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

    campeoesMundiaisFifa.put("Brasil", 6);
    campeoesMundiaisFifa.put("Alemanha", 1);

    campeoesMundiaisFifa.containsKey("Brasil");
  }
}
