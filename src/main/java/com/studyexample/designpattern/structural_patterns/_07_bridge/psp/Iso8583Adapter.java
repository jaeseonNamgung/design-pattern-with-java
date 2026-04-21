package com.studyexample.designpattern.structural_patterns._07_bridge.psp;

import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerRequest;
import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerResponse;

public class Iso8583Adapter implements ProtocolAdapter{
  @Override
  public AcquirerResponse send(AcquirerRequest request) {
    System.out.println("ISO 8583 프로토콜 전송: " + request.getTransactionId());
    return AcquirerResponse.approved();
  }
}
