package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class VisaAuthResponse implements AuthResponse{
  @Override
  public void parse() {
    System.out.println("VISA 응답 파싱");
  }
}
