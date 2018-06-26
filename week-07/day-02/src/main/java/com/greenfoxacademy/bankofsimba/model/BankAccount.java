package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private String balance;
  private String animalType;
  private boolean status;

  public BankAccount(String name, String balance, String animalType, boolean status) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.status = status;
  }

  public BankAccount() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
