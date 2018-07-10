package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Doubled;
import com.greenfoxacademy.rest.models.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Doubled getDouble(@RequestParam(value = "input") int value) {
    Doubled doubled = new Doubled(value);
    return doubled;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage vmi(MissingServletRequestParameterException ex) {
    return new ErrorMessage();
  }
}
