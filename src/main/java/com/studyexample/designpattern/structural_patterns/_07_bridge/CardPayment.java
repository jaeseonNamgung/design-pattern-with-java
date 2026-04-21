package com.studyexample.designpattern.structural_patterns._07_bridge;

public class CardPayment extends Payment{

  public CardPayment(PaymentChannel paymentChannel) {
    super(paymentChannel);
  }

  @Override
  public void pay(String amount) {
    System.out.println("카드 결제: ");
    paymentChannel.process(amount);
  }
}
