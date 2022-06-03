package com.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.entity.MyappEntity;

public interface MyappRepository extends JpaRepository<MyappEntity, Long> {

}
