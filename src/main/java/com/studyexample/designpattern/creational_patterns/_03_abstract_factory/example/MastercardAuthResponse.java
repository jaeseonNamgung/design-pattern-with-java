package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class MastercardAuthResponse implements AuthResponse{

  @Override
  public void parse() {
    System.out.println("MASTER 응답 파싱");
  }
}
