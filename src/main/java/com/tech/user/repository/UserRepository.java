package com.tech.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.user.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

	

}
