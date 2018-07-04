package com.greenfoxacademy.todosql;

import com.greenfoxacademy.todosql.model.Todo;
import com.greenfoxacademy.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodosqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("I have to learn Objectjfhfjhgfhjgfjgh Relational Mapping"));
  }
}
