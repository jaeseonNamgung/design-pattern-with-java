package com.studyexample.designpattern.structural_patterns._07_bridge.psp;

import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerContext;
import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerResponse;

public class PspApp {

  public static void main(String[] args) {
    MastercardAcquirerStrategy strategy = new MastercardAcquirerStrategy(new Iso8583Adapter());

    AcquirerResponse acquirerResponse = strategy.buildRequest(new AcquirerContext("outboxId", "transactionId", "transitTokenId"));
    System.out.println(acquirerResponse);
  }
}
