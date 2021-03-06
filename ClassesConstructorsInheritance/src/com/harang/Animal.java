package com.harang;

public class Animal {
  private String name;
  private int brain;
  private int body;
  private int size;
  private int weight;

  public Animal(String name, int brain, int body, int size, int weight) {
    this.name = name;
    this.brain = brain;
    this.body = body;
    this.size = size;
    this.weight = weight;
  }

  public void eat() {
    System.out.println("Animal.eat() called");
  }

  public void move(int speed) {
    System.out.println("Animal.move() called");
    System.out.println("Animal is moving at " + speed);
  }

  public String getName() {
    return name;
  }

  public int brain() {
    return brain;
  }

  public int body() {
    return body;
  }

  public int size() {
    return size;
  }

  public int weight() {
    return weight;
  }
}
