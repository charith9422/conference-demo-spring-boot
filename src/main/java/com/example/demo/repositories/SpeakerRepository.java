package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
