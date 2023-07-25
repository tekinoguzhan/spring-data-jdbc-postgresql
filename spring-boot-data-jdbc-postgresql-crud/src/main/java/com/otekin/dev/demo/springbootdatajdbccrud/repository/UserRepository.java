package com.otekin.dev.demo.springbootdatajdbccrud.repository;

import com.otekin.dev.demo.springbootdatajdbccrud.model.User;

import java.util.List;

public interface UserRepository {

	public User findOne(Long id);

	public List<User> findAll();

	public void save(User user);

	public Long saveAndReturnId(User user);

	public void update(User user);

	public Boolean delete(Long id);

}