package com.Ddevanle.TodoList.repo;

import com.Ddevanle.TodoList.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Item, Long> {


}
