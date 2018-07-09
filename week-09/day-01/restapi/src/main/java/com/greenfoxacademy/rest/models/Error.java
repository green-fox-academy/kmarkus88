package com.greenfoxacademy.rest.models;

public class Error {

  private String error;

  public Error() {
  }

  public Error(String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
