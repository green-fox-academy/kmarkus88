package com.greenfoxacademy.listingtodo.controller;

import com.greenfoxacademy.listingtodo.model.Todo;
import com.greenfoxacademy.listingtodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value ={"/", "/list"})
    public String list (Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
