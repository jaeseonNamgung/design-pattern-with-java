package com.studyexample.designpattern.structural_patterns.flyweight;

import com.studyexample.designpattern.structural_patterns._07_bridge.PaymentChannel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentRequest {
  private final String cardNumber;
  private final int amount;
  private final String brandName;

  public static PaymentRequest of(String cardNumber, int amount, String brandName) {
    return new PaymentRequest(cardNumber, amount, brandName);
  }

  public void execute() {
    CardBrand brand = CardBrandFactory.getBrand(brandName);
    brand.process(cardNumber, amount);
  }


}
