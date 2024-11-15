package com.doctor.doctor.service;

import com.doctor.doctor.dto.RegisterDto;

public interface RegisterService {
    RegisterDto signup(RegisterDto registerDto);

    RegisterDto findByEmail(String registerEmail);


//    Object login(RegisterDto registerDto);
}
