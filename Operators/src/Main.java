public class Main {
  public static void main(String[] args) {
    int result = 1 + 2;
    System.out.println(result);
    result = result + 1;
    System.out.println(result);
    result++;
    System.out.println(result);
    result += 10;
    System.out.println(result);
    result %= 4;
    System.out.println(result);

    boolean isAlien = false;
    boolean wasAlien = isAlien ? true : false;
    System.out.println(wasAlien);
  }
}