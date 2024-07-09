package com.cwm.glitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwm.glitter.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
