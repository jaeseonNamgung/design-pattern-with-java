package com.studyexample.designpattern.structural_patterns._07_bridge;

public class OnlineChannel implements PaymentChannel {
  @Override
  public void process(String amount) {
    System.out.println("온라인 채널로 " + amount + " 처리");
  }
}
