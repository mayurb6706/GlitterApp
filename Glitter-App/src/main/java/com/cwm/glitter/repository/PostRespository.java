package com.cwm.glitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwm.glitter.entity.Post;

public interface PostRespository extends JpaRepository<Post, Integer>{

}
