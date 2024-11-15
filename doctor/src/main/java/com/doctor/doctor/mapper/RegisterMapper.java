// RegisterMapper.java
package com.doctor.doctor.mapper;

import com.doctor.doctor.dto.RegisterDto;
import com.doctor.doctor.model.Register;
import org.springframework.stereotype.Service;

@Service
public class RegisterMapper {

    // Converts RegisterDto to Register
    public Register toregister(RegisterDto registerDto) {
        Register register = new Register();
        register.setEmail(registerDto.getEmail());
        register.setGender(registerDto.getGender());
        register.setName(registerDto.getName());
        register.setPassword(registerDto.getPassword());
        register.setRole(registerDto.getRole());
        return register;
    }

    // Converts Register to RegisterDto
    public RegisterDto toregisterDto(Register register) {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setId(register.getId());
        registerDto.setEmail(register.getEmail());
        registerDto.setGender(register.getGender());
        registerDto.setName(register.getName());
        registerDto.setPassword(register.getPassword());
        registerDto.setRole(register.getRole());
        return registerDto;
    }
    public RegisterDto toregisterDtos(Register register) {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setId(register.getId());

        registerDto.setGender(register.getGender());
        registerDto.setName(register.getName());
        registerDto.setPassword(register.getPassword());
        registerDto.setRole(register.getRole());
        return registerDto;
    }


//    public RegisterDto toDto(Register register) {
//
//    }
}
