package com.studyexample.designpattern.structural_patterns._07_bridge.example;

public class MarketingNotification extends Notification{

  private final String campaignId;

  public MarketingNotification(NotificationSender sender, String campaignId) {
    super(sender);
    this.campaignId = campaignId;
  }

  @Override
  public void send(String recipient, String message) {
    System.out.println("캠페인ID: " + campaignId);
    sender.send(recipient, "[이벤트/혜택] " + message);
  }
}
