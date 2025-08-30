package com.example.pib2.repository;

import com.example.pib2.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // método útil para login/búsqueda por correo
    Optional<User> findByEmail(String email);
}
