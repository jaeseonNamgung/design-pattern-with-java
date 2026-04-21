package com.studyexample.designpattern.structural_patterns.decorator;

public class Americano implements Coffee{

  @Override
  public double cost() {
    return 2.0;
  }

  @Override
  public String description() {
    return "아메리카노";
  }
}
