package com.studyexample.designpattern.structural_patterns._07_bridge.example;

public abstract class Notification{

  protected NotificationSender sender;

  public Notification(NotificationSender sender) {
    this.sender = sender;
  }

  public abstract void send(String recipient, String message);
}
