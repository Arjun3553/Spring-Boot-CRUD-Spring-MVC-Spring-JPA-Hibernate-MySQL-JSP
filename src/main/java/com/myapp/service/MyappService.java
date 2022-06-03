package com.myapp.service;

import java.util.List;

import com.myapp.entity.MyappEntity;

public interface MyappService {

	public boolean isvalidlogin(String name, String pass);

	public MyappEntity create(MyappEntity myappEntity);

	public List<MyappEntity> read();

	public MyappEntity update(long id);

	public void delete(long id);

}
