package com.studyexample.designpattern.structural_patterns._07_bridge.example;

public class Client {
  public static void main(String[] args) {
    UrgentNotification emailUrgentNoti = new UrgentNotification(new EmailSender());
    UrgentNotification smsUrgentNoti = new UrgentNotification(new SmsSender());

    System.out.println("--");

    MarketingNotification emailMarketing = new MarketingNotification(new EmailSender(), "channel1");
    emailMarketing.send("sunnamgung@naver.com", "마케팅 수신");
    MarketingNotification smsMarketing = new MarketingNotification(new SmsSender(), "channel1");
  }
}
