package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showBankAccountController {

  @GetMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @GetMapping("/utext")
  public String showTestText(Model model) {
    String testText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("testText", testText);
    return "utext";
  }
}