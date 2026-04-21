package com.studyexample.designpattern.structural_patterns.flyweight;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<PaymentRequest> requests = List.of(
        PaymentRequest.of("4111-1111-1111-1111", 50_000, "VISA"),
        PaymentRequest.of("4222-2222-2222-2222", 30_000, "VISA"),      // VISA 재사용
        PaymentRequest.of("5100-0000-0000-0000", 80_000, "MASTERCARD"),
        PaymentRequest.of("9400-0000-0000-0000", 20_000, "LOCAL"),
        PaymentRequest.of("9400-1111-1111-1111", 15_000, "LOCAL")
    );

    requests.forEach(PaymentRequest::execute);

    System.out.println("\n생성된 CardBrand 인스턴스 수: " + CardBrandFactory.getCacheSize()); // 3
    System.out.println("처리된 결제 건수: " + requests.size()); // 5
  }
}
