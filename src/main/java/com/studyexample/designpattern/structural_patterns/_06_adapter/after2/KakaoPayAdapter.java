package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class KakaoPayAdapter implements PaymentGateway{

  private final KakaoPayGateway kakaoPayGateway;

  @Override
  public boolean support(String pgCode) {
    return "KAKAOPAY".equals(pgCode);
  }

  @Override
  public PaymentResult pay(PaymentRequest paymentRequest) {
    KakaoPayResponse kakaoPayResponse = kakaoPayGateway.requestPayment(paymentRequest.orderId(),
                                                                       (int) paymentRequest.amount(),
                                                                       paymentRequest.currency());

    boolean isSuccess = "SUCCESS".equals(kakaoPayResponse.status());
    return PaymentResult.of(isSuccess, kakaoPayResponse.tid(), kakaoPayResponse.failReason());
  }
}
