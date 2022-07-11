package com.harang;

public class Main {
  public static void main(String[] args) {
//    Car porsche = new Car();
//    Car holden = new Car();
//    porsche.setModel("Carrera");
//    System.out.println("Model is " + porsche.getModel());

    Animal animal = new Animal("Animal", 1, 1, 5, 5);
    Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
    dog.eat();
    dog.walk();
    dog.run();
  }
}