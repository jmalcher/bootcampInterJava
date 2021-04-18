package com.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

