package com.mdev.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdev.spring.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}