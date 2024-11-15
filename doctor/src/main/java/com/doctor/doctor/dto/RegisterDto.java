package com.doctor.doctor.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegisterDto {
    private Long id;
    private String email;
    private String gender;
    private String name;
    private String password;
    private String role;

}
