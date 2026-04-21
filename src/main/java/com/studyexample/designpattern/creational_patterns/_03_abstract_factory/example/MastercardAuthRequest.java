package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class MastercardAuthRequest implements AuthRequest{
  @Override
  public void send() {
    System.out.println("MASTER 인증 요청");
  }
}
