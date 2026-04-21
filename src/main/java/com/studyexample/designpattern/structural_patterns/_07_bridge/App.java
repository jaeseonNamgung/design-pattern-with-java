package com.studyexample.designpattern.structural_patterns._07_bridge;

public class App {
  public static void main(String[] args) {
    CardPayment cardPayment = new CardPayment(new OfflineChannel());
    cardPayment.pay("10000");
  }
}
