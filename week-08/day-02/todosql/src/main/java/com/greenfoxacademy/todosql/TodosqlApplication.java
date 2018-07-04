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
    todoRepository.save(new Todo("daily task"));
    todoRepository.save(new Todo("make the beds", false, true));
    todoRepository.save(new Todo("wake up", true, true));
    todoRepository.save(new Todo("clean the kitchen"));
    todoRepository.save(new Todo("cook dinner", true, false));
    todoRepository.save(new Todo("play ps", true, true));
    todoRepository.save(new Todo("sleep", true, false));
    todoRepository.save(new Todo("wash the car"));
    todoRepository.save(new Todo("slap somebody", true, false));
    todoRepository.save(new Todo("listen music", true, true));
    todoRepository.save(new Todo("eat something"));
  }
}
