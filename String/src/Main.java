public class Main {
  public static void main(String[] args) {
    String myString = "This is a string";
    System.out.println("myString = " + myString);
    myString = myString + ", and this is more";
    System.out.println("myString = " + myString);
    myString = myString + " \u00A9 2019";
    System.out.println("myString = " + myString);
    String numString = "250.55";
    numString = numString + "49.95";
    System.out.println(numString);
    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("lastString + myInt = " + lastString);
    double myDouble = 123.45;
    lastString = lastString + myDouble;
    System.out.println("lastString + myDouble = " + lastString);
  }
}