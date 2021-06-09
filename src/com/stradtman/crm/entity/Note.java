package com.stradtman.crm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="date")
	private Date date;
	@Column(name="notes")
	private String notes;
	@Column(name="todo_due_date")
	private Date todoDueDate;
	
	@OneToMany
	@JoinColumn(name="todo_description")
	private TodoDescription todoDescription;
	
	@OneToMany
	@JoinColumn(name="todo_status")
	private TodoStatus todoStatus;
}
