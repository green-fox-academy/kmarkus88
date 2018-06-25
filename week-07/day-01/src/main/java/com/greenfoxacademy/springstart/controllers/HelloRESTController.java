package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  private AtomicLong c = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(c.getAndIncrement(), "Hello " + name);
    return greeting;
  }
}
