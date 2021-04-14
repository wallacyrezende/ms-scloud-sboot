package com.devwall.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devwall.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
