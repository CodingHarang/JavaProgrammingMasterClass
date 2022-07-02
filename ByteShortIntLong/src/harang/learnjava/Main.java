package harang.learnjava;

public class Main {
  public static void main(String[] args) {
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("MinInteger = " + myMinIntValue);
    System.out.println("MaxInteger = " + myMaxIntValue);
    System.out.println("MinInteger - 1 = " + (myMinIntValue - 1));
    System.out.println("MaxInteger + 1 = " + (myMaxIntValue + 1));

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("MinByte = " + myMinByteValue);
    System.out.println("MaxByte = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("MinShort = " + myMinShortValue);
    System.out.println("MaxShort = " + myMaxShortValue);

    Long myMinLongValue = Long.MIN_VALUE;
    Long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("MinLong = " + myMinLongValue);
    System.out.println("MaxLong = " + myMaxLongValue);

    byte myByteNum = (byte) (1000000 / 2);
    short myShortNum = (short) (1000000 / 2);
    System.out.println("myByteNum = " + myByteNum);
    System.out.println("myShortNum = " + myShortNum);
  }
}