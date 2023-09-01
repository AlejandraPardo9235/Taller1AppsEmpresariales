package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.models.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
