package br.com.kmpx.msworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kmpx.msworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
