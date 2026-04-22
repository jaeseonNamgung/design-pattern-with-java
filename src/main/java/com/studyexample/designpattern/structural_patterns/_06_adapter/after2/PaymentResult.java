package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

record PaymentResult(boolean success,
                     String transactionId,
                     String message) {

  public static PaymentResult of(boolean success, String transactionId, String message) {
    return new PaymentResult(success, transactionId, message);
  }
}
