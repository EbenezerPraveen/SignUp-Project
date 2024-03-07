package com.SignUP.Practice.service.impl;

import com.SignUP.Practice.entity.SignUp;
import com.SignUP.Practice.payload.SignUpDto;
import com.SignUP.Practice.repository.SignUpRepository;
import com.SignUP.Practice.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRepository signUpRepository;


    @Override
    public SignUpDto createAccount(SignUpDto signUpDto) {

        SignUp signUp = new SignUp();

        signUp.setId(signUpDto.getId());
        signUp.setUsername(signUpDto.getUsername());
        signUp.setPassword(signUpDto.getPassword());
        signUp.setEmail(signUpDto.getEmail());

        SignUp save = signUpRepository.save(signUp);

        SignUpDto dto = new SignUpDto();

        dto.setId(save.getId());
        dto.setUsername(save.getUsername());
        dto.setPassword(save.getPassword());
        dto.setEmail(save.getEmail());

        return dto;
    }
}
