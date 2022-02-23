package com.craig.javaExam.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.craig.javaExam.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	  List<User> findAll();
	  Optional<User> findByEmail(String email);

}
