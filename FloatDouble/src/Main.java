public class Main {
  public static void main(String[] args) {
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("MinFloat = " + myMinFloatValue);
    System.out.println("MaxFloat = " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("MinDouble = " + myMinDoubleValue);
    System.out.println("MaxDouble = " + myMaxDoubleValue);

    int myInt = 5 / 3;
    float myFloat = 5f / 3f;
    double myDouble = 5d / 3d;
    System.out.println("myInt = " + myInt);
    System.out.println("myFloat = " + myFloat);
    System.out.println("myDouble = " + myDouble);
  }
}