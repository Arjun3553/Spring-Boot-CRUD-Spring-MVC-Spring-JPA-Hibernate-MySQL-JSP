package com.myapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.myapp.entity.MyappEntity;
import com.myapp.repository.MyappRepository;
import com.myapp.service.MyappService;

@Service
public class MyappServiceImpl implements MyappService {
	private MyappRepository myappRepository;

	public MyappServiceImpl(MyappRepository myappRepository) {
		super();
		this.myappRepository = myappRepository;
	}

	@Override
	public boolean isvalidlogin(String name, String pass) {
		if (name.equalsIgnoreCase("root") && pass.equalsIgnoreCase("root")) {
			return true;
		}
		return false;
	}

	@Override
	public MyappEntity create(MyappEntity myappEntity) {

		return myappRepository.save(myappEntity);
	}

	@Override
	public List<MyappEntity> read() {
		return myappRepository.findAll();
	}

	@Override
	public MyappEntity update(long id) {
		Optional<MyappEntity> optional = myappRepository.findById(id);
		MyappEntity myappEntity = null;
		if (optional.isPresent()) {
			myappEntity = optional.get();
		} else {
			throw new RuntimeException("no record found for id :" + id);
		}
		return myappEntity;
	}

	@Override
	public void delete(long id) {
		myappRepository.deleteById(id);
	}

}
