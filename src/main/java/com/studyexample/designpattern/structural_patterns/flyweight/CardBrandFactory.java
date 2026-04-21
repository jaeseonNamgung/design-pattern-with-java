package com.studyexample.designpattern.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CardBrandFactory {

  private static final Map<String, CardBrand> cache = new HashMap<>();

  public static CardBrand getBrand(String brandName) {
    return cache.computeIfAbsent(brandName, name ->
       switch (name) {
        case "VISA" -> new ConcreteCardBrand("VISA", 0.015);
        case "MASTERCARD" -> new ConcreteCardBrand("MASTERCARD", 0.018);
        case "LOCAL" -> new ConcreteCardBrand("LOCAL", 0.010);
        default -> throw new IllegalArgumentException("지원하지 않는 브랜드: " + name);
    });
  }

  public static int getCacheSize() {
    return cache.size();
  }
}
