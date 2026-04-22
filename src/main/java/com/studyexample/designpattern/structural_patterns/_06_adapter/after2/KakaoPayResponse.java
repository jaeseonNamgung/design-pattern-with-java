package com.studyexample.designpattern.structural_patterns._06_adapter.after2;

record KakaoPayResponse(
    String tid,
    String status,
    String failReason
) {

  public static KakaoPayResponse success(String tid) {
    return new KakaoPayResponse(tid, "SUCCESS", null);
  }

  public static KakaoPayResponse fail(String reason) {
    return new KakaoPayResponse(null, "FAIL", reason);
  }
}
