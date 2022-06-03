package com.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myapp")
public class MyappEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name",nullable = false)
	private String name;
	@Column(name = "number",nullable = false)
	private String number;
	@Column(name = "email",nullable = false)
	private String email;

	public MyappEntity() {
		super();
	}

	public MyappEntity(long id, String name, String number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
