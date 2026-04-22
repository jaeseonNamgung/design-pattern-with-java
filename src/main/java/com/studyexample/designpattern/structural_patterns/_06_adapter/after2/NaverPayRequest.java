package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

record NaverPayRequest(
    String merchantOrderId,
    long paymentAmount,
    String currencyCode
) {

  public static NaverPayRequest of(String merchantOrderId, long paymentAmount, String currencyCode) {
    return new NaverPayRequest(merchantOrderId, paymentAmount, currencyCode);
  }
}
