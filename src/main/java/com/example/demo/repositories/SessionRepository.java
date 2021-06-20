package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{
//by using session jpa class we will be able to perform find,update,delete etc operations
}
