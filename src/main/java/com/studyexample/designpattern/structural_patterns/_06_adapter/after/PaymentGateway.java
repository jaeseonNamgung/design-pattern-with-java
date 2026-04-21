package com.studyexample.designpattern.structural_patterns._06_adapter.after;

interface PaymentGateway {
  PaymentResult pay(PaymentRequest paymentRequest);
  void cancel(String transactionId);
}
