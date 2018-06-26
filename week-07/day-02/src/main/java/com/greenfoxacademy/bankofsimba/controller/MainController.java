package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
  private List<BankAccount> bankAccounts;

  public MainController() {
    bankAccounts = new ArrayList<>();
    BankAccount timonacc = new BankAccount("Timon", "4000", "mongoose", true);
    BankAccount pumbaacc = new BankAccount("Pumba", "3234", "pig", false);
    BankAccount mufasaacc = new BankAccount("Mufasa", "10000", "lion", false);
    BankAccount simbaacc = new BankAccount("Simba", "5635", "lion", false);
    BankAccount rafikiacc = new BankAccount("Rafiki", "216578", "monkey", false);
    bankAccounts.add(timonacc);
    bankAccounts.add(pumbaacc);
    bankAccounts.add(mufasaacc);
    bankAccounts.add(simbaacc);
    bankAccounts.add(rafikiacc);
  }

  @GetMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion", false);
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @GetMapping("/utext")
  public String showTestText(Model model) {
    String testText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("testText", testText);
    return "utext";
  }

  @GetMapping("/bankaccount")
  public String getBankAccount(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "bankaccount";
  }
}