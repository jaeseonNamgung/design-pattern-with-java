package com.studyexample.designpattern.structural_patterns._06_adapter.after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class PaymentAdapter implements PaymentGateway {

  private final SnowPayClient snowPayClient;

  @Override
  public PaymentResult pay(PaymentRequest paymentRequest) {
    SnowPayResponse response = snowPayClient.requestPayment(paymentRequest.orderId(),
                                                                   Integer.parseInt(paymentRequest.amount()),
                                                                   paymentRequest.currency());

    return PaymentResult.of(response.txnNo(), response.resultCode());
  }

  @Override
  public void cancel(String transactionId) {
    snowPayClient.requestCancel(transactionId);
  }
}
