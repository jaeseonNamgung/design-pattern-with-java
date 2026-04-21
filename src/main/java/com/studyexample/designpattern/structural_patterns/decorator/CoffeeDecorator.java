package com.studyexample.designpattern.structural_patterns.decorator;

public abstract class CoffeeDecorator implements Coffee {

  protected Coffee coffee;

  public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }
}
