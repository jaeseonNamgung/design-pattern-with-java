package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class MastercardFactory implements PaymentFactory{
  @Override
  public AuthRequest createAuthRequest() {
    return new MastercardAuthRequest();
  }

  @Override
  public AuthResponse createAuthResponse() {
    return new MastercardAuthResponse();
  }
}
