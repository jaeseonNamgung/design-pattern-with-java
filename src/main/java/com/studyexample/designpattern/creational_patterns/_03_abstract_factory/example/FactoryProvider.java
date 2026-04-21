package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class FactoryProvider {

  public static PaymentFactory getFactory(String scheme) {
    return switch (scheme) {
      case "VISA" -> new VisaFactory();
      case "MASTER" -> new MastercardFactory();
      default -> throw new IllegalArgumentException("지원 안함");
    };
  }
}
