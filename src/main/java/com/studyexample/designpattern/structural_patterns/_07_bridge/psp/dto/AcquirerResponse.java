package com.studyexample.designpattern.structural_patterns._07_bridge.psp.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class AcquirerResponse {

  private String        paymentStatus;
  private String               par;

  public static AcquirerResponse create(String paymentStatus,
                                        String par) {

    AcquirerResponse response = new AcquirerResponse();
    response.paymentStatus = paymentStatus;
    response.par = par;
    return response;
  }

  public static AcquirerResponse approved() {
    return AcquirerResponse.create("200", null);
  }
}
