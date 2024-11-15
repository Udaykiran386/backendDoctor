package com.doctor.doctor.controller;

import com.doctor.doctor.dto.LogInDto;
import com.doctor.doctor.dto.RegisterDto;
import com.doctor.doctor.mapper.RegisterMapper;
import com.doctor.doctor.model.Register;
import com.doctor.doctor.repository.RegisterRepo;
import com.doctor.doctor.service.RegisterService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Register/")


public class RegisterController {
    private final RegisterService registerService;
    private final RegisterRepo registerRepo;
    private final RegisterMapper registerMapper;

    public RegisterController(RegisterService registerService, RegisterRepo registerRepo, RegisterMapper registerMapper) {
        this.registerService = registerService;
        this.registerRepo = registerRepo;
        this.registerMapper = registerMapper;
    }


    @PostMapping("signup")
    public ResponseEntity<?> signup(@RequestBody RegisterDto registerDto){
        Optional<Register> optionalRegister=registerRepo.findByEmail(registerDto.getEmail());
        if(optionalRegister.isPresent()){
            return  ResponseEntity.status(HttpStatus.FOUND).body("email already Used");
        }
        else{
            return ResponseEntity.status(HttpStatus.OK).body(registerService.signup(registerDto));
        }
    }
    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody LogInDto logInDto){
        Optional<Register> optionalRegister=registerRepo.findByEmailAndPassword(logInDto.getEmail(),logInDto.getPassword());
        if(optionalRegister.isPresent()){
//            RegisterDto registerDto=registerMapper.registerDto(optionalRegister.get());
            return ResponseEntity.status(HttpStatus.OK).body("Login Successfull   ");
        }
        else {
            return ResponseEntity.status(HttpStatus.OK).body("create an account");
        }
    }

    @GetMapping("getByEmail/{registerEmail}")
    public ResponseEntity<RegisterDto> getByEmail(@Param("registerEmail") String registerEmail){
        return ResponseEntity.status(HttpStatus.OK).body(registerService.findByEmail(registerEmail));
    }

}
