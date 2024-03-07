package com.SignUP.Practice.service;

import com.SignUP.Practice.payload.SignUpDto;
import org.springframework.stereotype.Service;


public interface SignUpService {

    SignUpDto createAccount(SignUpDto signUpDto);
}
