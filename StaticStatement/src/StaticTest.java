public class StaticTest {
  private static int numInstances = 0;
  private String name;

  public StaticTest(String name) {
    this.name = name;
    numInstances++;
  }

  public static int getNumInstance() {
    return numInstances;
  }

  public String getName() {
    return name;
  }
}
