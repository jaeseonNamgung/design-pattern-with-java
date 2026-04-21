package com.studyexample.designpattern.structural_patterns._07_bridge;

public class OfflineChannel implements PaymentChannel{
  @Override
  public void process(String amount) {
    System.out.println("오프라인 채널로 " + amount + " 처리");
  }
}
