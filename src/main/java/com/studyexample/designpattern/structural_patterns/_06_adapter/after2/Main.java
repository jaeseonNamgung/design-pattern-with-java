package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

public class Main {
  public static void main(String[] args) {
    // Kakao Pay
    PaymentRequest paymentRequest = PaymentRequest.of("kakao-order-id", 1000, "KWR");

    PaymentGateway paymentGateway = PaymentGatewayFactory.gatewaySupport("KAKAOPAY");
    PaymentResult pay = paymentGateway.pay(paymentRequest);
    System.out.println(pay);

  }
}
