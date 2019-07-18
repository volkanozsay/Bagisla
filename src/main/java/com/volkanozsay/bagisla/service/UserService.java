package com.volkanozsay.bagisla.service;

import com.volkanozsay.bagisla.model.User;

import java.util.List;

public interface UserService {

	List<User> findAll();
	User findByUserId(Long id);
}
