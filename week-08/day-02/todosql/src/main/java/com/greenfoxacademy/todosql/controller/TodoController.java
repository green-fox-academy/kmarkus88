package com.greenfoxacademy.todosql.controller;

import com.greenfoxacademy.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = "/list")
    public String list (@RequestParam(value = "isActive", required = false) Boolean done,Model model) {
    model.addAttribute("todos", todoRepository.getByDone(done));
    return "todolist";
  }

  @GetMapping(value = "/")
  public String list (Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

}
