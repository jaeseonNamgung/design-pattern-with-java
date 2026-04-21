package com.studyexample.designpattern.structural_patterns._07_bridge.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SlackSender implements NotificationSender{

  private final String channel;

  @Override
  public void send(String recipient, String message) {

    System.out.println("[SLACK] 채널: #" + channel + " / 멘션: @" + recipient);
    System.out.println("내용: " + message);

  }
}
