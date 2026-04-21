package com.studyexample.designpattern.structural_patterns._07_bridge.psp;

import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerRequest;
import com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto.AcquirerResponse;

public interface ProtocolAdapter {
  AcquirerResponse send(AcquirerRequest request);
}
