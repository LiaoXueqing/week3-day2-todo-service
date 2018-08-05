package com.thoughtworks.training.xueqing.todoservice.repository;
import com.thoughtworks.training.xueqing.todoservice.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer>{
    List<Todo> findAllByUserIdEquals(Integer id);
    Todo findByIdEqualsAndUserIdEquals(Integer id, Integer userId);
}
