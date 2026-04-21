package com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class AcquirerContext {

  private String           outboxId;
  private String           transactionId;
  private String           transitTokenId;

  public AcquirerContext(String outboxId, String transactionId, String transitTokenId) {
    this.outboxId = outboxId;
    this.transactionId = transactionId;
    this.transitTokenId = transitTokenId;
  }
}

