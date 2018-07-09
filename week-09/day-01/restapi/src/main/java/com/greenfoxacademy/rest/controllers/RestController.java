package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Doubled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object getDoubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
      return new Error("Please provide an input!");
    }
    return new Doubled(number);
  }
  }
