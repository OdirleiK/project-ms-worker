package br.com.kmpx.msuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kmpx.msuser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
