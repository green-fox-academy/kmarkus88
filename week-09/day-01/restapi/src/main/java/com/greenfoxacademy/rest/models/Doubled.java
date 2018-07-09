package com.greenfoxacademy.rest.models;

public class Doubled {

  Integer received;
  Integer result;

  public Doubled(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public Doubled() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
