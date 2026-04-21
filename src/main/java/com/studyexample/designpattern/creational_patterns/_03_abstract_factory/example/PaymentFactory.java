package com.studyexample.designpattern.creational_patterns._03_abstract_factory.example;

public interface PaymentFactory {

  AuthRequest createAuthRequest();
  AuthResponse createAuthResponse();
}
