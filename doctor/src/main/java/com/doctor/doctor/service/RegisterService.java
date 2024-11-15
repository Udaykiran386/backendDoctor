package com.doctor.doctor.service;

import com.doctor.doctor.dto.LogInDto;
import com.doctor.doctor.dto.RegisterDto;

public interface RegisterService {
    RegisterDto signup(RegisterDto registerDto);

    RegisterDto findByEmail(String registerEmail);

    RegisterDto login(LogInDto logInDto);


//    Object login(RegisterDto registerDto);
}
