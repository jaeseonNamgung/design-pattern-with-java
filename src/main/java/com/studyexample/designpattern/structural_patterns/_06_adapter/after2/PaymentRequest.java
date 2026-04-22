package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

record PaymentRequest(String orderId,
                      long amount,
                      String currency) {
  public static PaymentRequest of(String orderId, long amount, String currency) {
    return new PaymentRequest(orderId, amount, currency);
  }
}
