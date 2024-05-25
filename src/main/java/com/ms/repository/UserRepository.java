package com.ms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByEmail(String email);
}
