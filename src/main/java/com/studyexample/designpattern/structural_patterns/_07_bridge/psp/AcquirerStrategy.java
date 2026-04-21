package com.studyexample.designpattern.structural_patterns._07_bridge.psp;

import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerContext;
import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerResponse;

public abstract class AcquirerStrategy {

  protected ProtocolAdapter protocolAdapter;

  public AcquirerStrategy(ProtocolAdapter protocolAdapter) {
    this.protocolAdapter = protocolAdapter;
  }

  protected abstract AcquirerResponse buildRequest(AcquirerContext context);
}
