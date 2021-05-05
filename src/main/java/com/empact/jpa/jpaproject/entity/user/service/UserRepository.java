package com.empact.jpa.jpaproject.entity.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empact.jpa.jpaproject.entity.user.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
