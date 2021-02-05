package com.todo.todoproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.todoproject.model.TaskModel;



public interface TaskRepository extends CrudRepository<TaskModel, Integer> {
}
