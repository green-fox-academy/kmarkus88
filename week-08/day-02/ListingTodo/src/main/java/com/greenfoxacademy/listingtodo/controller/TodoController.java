package com.greenfoxacademy.listingtodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

@GetMapping("/todo")
  public String todo (Model model) {

  return "todo";
  }
}
