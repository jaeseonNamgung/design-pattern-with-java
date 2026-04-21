package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class VisaAuthRequest implements AuthRequest{
  @Override
  public void send() {
    System.out.println("VISA 인증 요청");
  }
}
