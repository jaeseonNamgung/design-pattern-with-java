package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

public class NaverPayGateway {

  public NaverPayResult processPayment(NaverPayRequest request) {
    System.out.println("[NaverPay] 결제 요청 - orderId: " + request.merchantOrderId());
    return NaverPayResult.success("NAVER-PAY-" + request.merchantOrderId());
  }

  public void cancelProcess(String paymentId, long amount) {
    System.out.println("[NaverPay] 취소 요청 - paymentId: " + paymentId);
  }
}
