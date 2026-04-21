package com.studyexample.designpattern.structural_patterns._07_bridge.example;

public class EmailSender implements NotificationSender{
  @Override
  public void send(String recipient, String message) {
    System.out.println("[Email] 수신: " + recipient);
    System.out.println("내용: " + message);
  }
}
