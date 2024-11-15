package com.doctor.doctor.controller;

import com.doctor.doctor.model.Doctor;
import com.doctor.doctor.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Doctor/")

public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("register")
    public Doctor register(@RequestBody Doctor doctor){
        return  doctorService.register(doctor);

    }
    @GetMapping("getById/{doctorId}")
    public Doctor getById(@PathVariable long doctorId){
        return doctorService.getById(doctorId);
    }
    @GetMapping("getAlldoctors")
    public List<Doctor> getAlldoctors(){
        return doctorService.getAlldoctors();
    }
    @PostMapping("update")
    public Doctor update(@RequestBody Doctor doctor){
        return doctorService.update(doctor);
    }
    @DeleteMapping("deleteId/{doctorId}")
    public String deleteId(@PathVariable long doctorId){
        doctorService.deleteId(doctorId);
        return "Deleted";
    }
}
