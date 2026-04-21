package com.studyexample.designpattern.structural_patterns._07_bridge.psp;

import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerContext;
import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerRequest;
import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerResponse;

public class MastercardAcquirerStrategy extends AcquirerStrategy{

  public MastercardAcquirerStrategy(ProtocolAdapter protocolAdapter) {
    super(protocolAdapter);
  }

  @Override
  protected AcquirerResponse buildRequest(AcquirerContext context) {

    AcquirerRequest acquirerRequest = new AcquirerRequest(context.getTransactionId(), 10000);
    return protocolAdapter.send(acquirerRequest);
  }

}
