package com.studyexample.designpattern.structural_patterns._07_bridge;

public class CashPayment extends Payment {

  public CashPayment(PaymentChannel paymentChannel) {
    super(paymentChannel);
  }

  @Override
  public void pay(String amount) {
    System.out.println("현금 결제: ");
    paymentChannel.process(amount);
  }
}
