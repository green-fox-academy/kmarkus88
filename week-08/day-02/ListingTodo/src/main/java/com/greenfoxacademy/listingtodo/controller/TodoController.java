package com.greenfoxacademy.listingtodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//ez a @RequestMapping ahhoz kell hogy az osszes oldal a localhost:8080todo oldalon jelenjen meg
@RequestMapping("/todo")
public class TodoController {
  //ez pedig ahhoz hogy a pertodoperlist vagy pertodoper url-en jelenjen meg
  @GetMapping(value ={"/", "/list"})
  //A @ResponseBody ahhoz kellett hogy html file nelkul irjak a localhostra
  //@ResponseBody
    public String list (Model model) {
    //a returnbe pedig jott a szoveg
    return "index";
  }
}
