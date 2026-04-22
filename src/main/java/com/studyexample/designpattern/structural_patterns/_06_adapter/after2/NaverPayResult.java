package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

public record NaverPayResult(
    String paymentId,
    int resultCode,
    String resultMsg
) {
  public static NaverPayResult success(String paymentId) {
    return new NaverPayResult(paymentId, 0, "성공");
  }

  public static NaverPayResult fail(int code, String msg) {
    return new NaverPayResult(null, code, msg);
  }

  public boolean isSuccess() {
    return resultCode == 0;
  }
}
