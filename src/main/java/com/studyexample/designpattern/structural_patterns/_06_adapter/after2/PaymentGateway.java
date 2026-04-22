package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

interface PaymentGateway {
  boolean support(String pgCode);
  PaymentResult pay(PaymentRequest paymentRequest);
}
