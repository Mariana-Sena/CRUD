package com.onboarding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message){
        super(message);
    }
}



