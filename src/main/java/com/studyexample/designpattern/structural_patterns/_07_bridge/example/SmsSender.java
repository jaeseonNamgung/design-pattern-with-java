package com.studyexample.designpattern.structural_patterns._07_bridge.example;

public class SmsSender implements NotificationSender{
  @Override
  public void send(String recipient, String message) {
    System.out.println("[SMS] 수신번호: " + recipient);
    System.out.println("내용: " + message);
  }
}
