package com.greenfoxacademy.todosql.controller;

import com.greenfoxacademy.todosql.model.Todo;
import com.greenfoxacademy.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = "/")
  public String list (Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping(value = "/list")
    public String list (@RequestParam(value = "isActive", required = false) Boolean done,Model model) {
    model.addAttribute("todos", todoRepository.getByDone(done));
    return "todolist";
  }

  @GetMapping("/add")
  public String getNewTodoForm(Model model){
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo){
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodoById(@PathVariable("id") Long id){
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }
}
