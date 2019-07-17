package com.volkanozsay.bagisla.repository;

import com.volkanozsay.bagisla.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u") List<User> findAll();

	@Query("SELECT u FROM User u where u.userId=?1") User findByUserId(Long id);
}
