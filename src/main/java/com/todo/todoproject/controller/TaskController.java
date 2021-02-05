package com.todo.todoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todoproject.service.TaskService;
import com.todo.todoproject.model.TaskModel;

@RestController
public class TaskController {
	@Autowired
	TaskService taskService;

	@RequestMapping("/task")
	public String index() {
		return "Greeting from Spring Boot!";
	}

	@GetMapping("/task")
	private List<TaskModel> getAllTask() {
		return taskService.getAllTask();
	}

	@GetMapping("/task/{id}")
	private TaskModel getTask(@PathVariable("id") int id) {
		return taskService.getTaskById(id);
	}

	@DeleteMapping("/task/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
		taskService.delete(id);
	}

	@PostMapping("/task")
	private int saveTask(@RequestBody TaskModel task) {
		taskService.saveOrUpdate(task);
		return task.getId();
	}
}