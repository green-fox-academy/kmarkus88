package com.grennfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String getIndex() {
    return "index.html";
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String createLoginAccount() {
    return ("login");
  }
}
