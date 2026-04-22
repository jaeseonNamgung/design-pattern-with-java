package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class NaverPayAdapter implements PaymentGateway{

  private final NaverPayGateway naverPayGateway;

  @Override
  public boolean support(String pgCode) {
    return "NAVERPAY".equals(pgCode);
  }

  @Override
  public PaymentResult pay(PaymentRequest paymentRequest) {

    NaverPayRequest naverPayRequest = NaverPayRequest.of(paymentRequest.orderId(), paymentRequest.amount(), paymentRequest.currency());
    NaverPayResult naverPayResult = naverPayGateway.processPayment(naverPayRequest);

    return PaymentResult.of(naverPayResult.isSuccess(), naverPayResult.paymentId(), naverPayResult.resultMsg());
  }
}
