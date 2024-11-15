package com.doctor.doctor.service;

import com.doctor.doctor.model.Doctor;
import com.doctor.doctor.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImp implements DoctorService{
    private final DoctorRepository doctorRepository;

    public DoctorServiceImp(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor register(Doctor doctor) {
        return doctorRepository.save(doctor) ;

    }

    @Override
    public Doctor getById(long doctorId) {
        return doctorRepository.findById(doctorId).get();
    }

    @Override
    public List<Doctor> getAlldoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor update(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void deleteId(long doctorId) {
        doctorRepository.deleteById(doctorId);
    }
}
