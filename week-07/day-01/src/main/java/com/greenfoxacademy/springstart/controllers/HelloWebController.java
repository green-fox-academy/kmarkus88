package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private AtomicLong c = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name, Model model2) {
    model.addAttribute("name", name);
    model2.addAttribute("id", c.getAndIncrement());
    return "greeting";
  }
}
