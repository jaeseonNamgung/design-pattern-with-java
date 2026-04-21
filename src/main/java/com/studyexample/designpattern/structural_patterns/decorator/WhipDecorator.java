package com.studyexample.designpattern.structural_patterns.decorator;

public class WhipDecorator extends CoffeeDecorator{

  public WhipDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double cost() {
    return coffee.cost() + 0.7;
  }

  @Override
  public String description() {
    return coffee.description() + " + 시럽";
  }
}
