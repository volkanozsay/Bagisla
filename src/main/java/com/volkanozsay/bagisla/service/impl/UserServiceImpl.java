package com.volkanozsay.bagisla.service.impl;

import com.volkanozsay.bagisla.model.User;
import com.volkanozsay.bagisla.repository.UserRepository;
import com.volkanozsay.bagisla.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override public User findByUserId(Long id) {
		return userRepository.findByUserId(id);
	}
}
