package com.studyexample.designpattern.structural_patterns._06_adapter.after;

import com.studyexample.designpattern.structural_patterns._07_bridge.Payment;

record PaymentResult(
    String transactionId,
    String status
) {

  public static PaymentResult of(String transactionId, String status) {
    return new PaymentResult(transactionId, status);
  }
}
