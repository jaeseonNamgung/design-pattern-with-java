package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

public class KakaoPayGateway {

  public KakaoPayResponse requestPayment(String orderId, int amount, String currency) {
    System.out.println("[KakaoPay] 결제 요청 - orderId: " + orderId + ", amount: " + amount);
    return KakaoPayResponse.success("KAKAO-TID-" + orderId);
  }

  public void cancelPayment(String tid) {
    System.out.println("[KakaoPay] 취소 요청 - tid: " + tid);
  }
}
