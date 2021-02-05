package com.todo.todoproject.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table
public class TaskModel {

	// Task name and description
	@Column
	private String name;

	// task ID
	@Id
	@Column
	private int Id;

	// @Column
	// private int age;
	// @Column
	// private String email;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
