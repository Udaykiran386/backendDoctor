package com.doctor.doctor.service;

import com.doctor.doctor.model.Doctor;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DoctorService {
    Doctor register(Doctor doctor);

    Doctor getById(long doctorId);

    List<Doctor> getAlldoctors();

    Doctor update(Doctor doctor);

    void deleteId(long doctorId);
}
