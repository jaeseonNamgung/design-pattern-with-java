package com.studyexample.designpattern.structural_patterns.flyweight;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConcreteCardBrand implements CardBrand{
  private final String brandName;
  private final double feeRate;

  @Override
  public void process(String cardNumber, int amount) {
    int fee = (int) (amount * feeRate);
    System.out.printf("[%s] 카드번호: %s | 결제금액: %d | 수수료: %d%n", brandName, cardNumber, amount, fee);
  }
}
