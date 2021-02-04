public class Estudante implements Comparable<Estudante>{
  private final String name;
  private final Integer age;

  public Estudante(String name, Integer age){
    this.name = name;
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + " - " + age;
  }

  @Override
  public int compareTo(Estudante arg0) {
    return this.getAge() - arg0.getAge();
  }
}
