package com.SignUP.Practice.controller;

import com.SignUP.Practice.payload.SignUpDto;
import com.SignUP.Practice.repository.SignUpRepository;
import com.SignUP.Practice.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @PostMapping
    public ResponseEntity<SignUpDto> postSignUp(@RequestBody SignUpDto signUpDto){
        SignUpDto dto = signUpService.createAccount(signUpDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
