package com.doctor.doctor.service;

import com.doctor.doctor.dto.RegisterDto;
import com.doctor.doctor.mapper.RegisterMapper;
import com.doctor.doctor.model.Register;
import com.doctor.doctor.repository.RegisterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service


public class RegisterServiceImp implements RegisterService{
    private final RegisterRepo registerRepo;
   private final RegisterMapper registerMapper;

    public RegisterServiceImp(RegisterRepo registerRepo, RegisterMapper registerMapper) {
        this.registerRepo = registerRepo;
        this.registerMapper = registerMapper;
    }

    @Override
    public RegisterDto signup(RegisterDto registerDto) {
        Register register=registerMapper.toregister(registerDto);
        Register register1=registerRepo.save(register);
        RegisterDto registerDto1=registerMapper.toregisterDto(register1);
        return registerDto1;
    }

    @Override
    public RegisterDto findByEmail(String registerEmail) {
        Optional<Register> optionalRegister=registerRepo.findByEmail(registerEmail);
        Register register=optionalRegister.get();
        RegisterDto registerDto=registerMapper.toregisterDto(register);
        return registerDto;
    }


}
