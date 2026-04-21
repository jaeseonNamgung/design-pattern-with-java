package com.studyexample.designpattern.structural_patterns.decorator;

public class Main {
  public static void main(String[] args) {
    Coffee coffee = new WhipDecorator(new MilkDecorator(new Americano()));

    System.out.println(coffee.description());
    System.out.println(coffee.cost());

    Coffee doubleMilk = new MilkDecorator(new MilkDecorator(new Americano()));
    System.out.println(doubleMilk.description());
    System.out.println(doubleMilk.cost());
  }
}
