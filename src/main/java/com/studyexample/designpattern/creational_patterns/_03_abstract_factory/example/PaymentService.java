package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class PaymentService {
  public static void main(String[] args) {
    PaymentFactory visa = FactoryProvider.getFactory("VISA");
    visa.createAuthRequest().send();
    visa.createAuthResponse().parse();


    PaymentFactory master = FactoryProvider.getFactory("MASTER");
    master.createAuthRequest().send();
    master.createAuthResponse().parse();
  }
}
