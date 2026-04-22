package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

import java.util.List;

class PaymentGatewayFactory {

  private static final List<PaymentGateway> paymentGateways = List.of(
      new KakaoPayAdapter(new KakaoPayGateway()),
      new NaverPayAdapter(new NaverPayGateway())
  );

  public static PaymentGateway gatewaySupport(String pgCode) {
    return paymentGateways.stream().filter(gateway -> gateway.support(pgCode)).findFirst()
        .orElseThrow(() -> new RuntimeException("pg 오류"));
  }
}
