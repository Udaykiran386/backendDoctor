package com.doctor.doctor.repository;

import com.doctor.doctor.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepo extends JpaRepository<Register,Long> {
    Optional<Register> findByEmail(String email);

    Optional<Register> findByEmailAndPassword(String email, String password);
}
