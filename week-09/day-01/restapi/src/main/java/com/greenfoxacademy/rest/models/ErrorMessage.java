package com.greenfoxacademy.rest.models;

public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
