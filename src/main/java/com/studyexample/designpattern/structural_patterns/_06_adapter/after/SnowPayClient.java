package com.studyexample.designpattern.structural_patterns._06_adapter.after;
class SnowPayClient {
  public SnowPayResponse requestPayment(String orderNo, int price, String curr) {
    return new SnowPayResponse("TXN-001", "SUCCESS");
  }

  public void requestCancel(String txnNo) {

  }

}
