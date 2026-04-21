package com.studyexample.designpattern.structural_patterns._07_bridge.example;

public class UrgentNotification extends Notification{

  public UrgentNotification(NotificationSender sender) {
    super(sender);
  }

  @Override
  public void send(String recipient, String message) {
    System.out.println("우선순위: URGENT / 재시도: 3회");
    sender.send(recipient, "[긴급공지] " + message);
  }
}
