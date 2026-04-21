package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public class VisaFactory implements PaymentFactory{
  @Override
  public AuthRequest createAuthRequest() {
    return new VisaAuthRequest();
  }

  @Override
  public AuthResponse createAuthResponse() {
    return new VisaAuthResponse();
  }
}
