package com.doctor.doctor.repository;

import com.doctor.doctor.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Long> {
}
