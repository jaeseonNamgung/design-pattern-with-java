package com.studyexample.designpattern.structural_patterns._07_bridge;

public abstract class Payment {

  protected final PaymentChannel paymentChannel;

  protected Payment(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }

  public abstract void pay(String amount);

}
