package com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto;

import lombok.Getter;

@Getter
public class AcquirerRequest {

  private final String transactionId;
  private final double amountTransaction;

  public AcquirerRequest(String transactionId, double amountTransaction) {
    this.transactionId = transactionId;
    this.amountTransaction = amountTransaction;
  }
}
