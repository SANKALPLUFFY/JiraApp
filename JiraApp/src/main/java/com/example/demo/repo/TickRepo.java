package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Ticket;

public interface TickRepo extends JpaRepository<Ticket, Integer>{

}
