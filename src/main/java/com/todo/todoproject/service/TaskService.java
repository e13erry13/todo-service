package com.todo.todoproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.todo.todoproject.model.TaskModel;
import com.todo.todoproject.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskrepoRepository;

	public List<TaskModel> getAllTask() {
		List<TaskModel> tasks = new ArrayList<TaskModel>();
		taskrepoRepository.findAll().forEach(task -> tasks.add(task));
		return tasks;
	}

	public TaskModel getTaskById(int id) {
		return taskrepoRepository.findById(id).get();
	}

	public void saveOrUpdate(TaskModel task) {
		taskrepoRepository.save(task);
	}

	public void delete(int id) {
		taskrepoRepository.deleteById(id);
	}
}
