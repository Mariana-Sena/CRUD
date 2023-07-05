package com.onboarding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onboarding.crud.api.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
/*Lombok é uma biblioteca de código aberto para Java que permite reduzir a quantidade de código boilerplate
(repetitivo) necessário em classes Java, especialmente em classes de modelo (POJOs - Plain Old Java Objects).
Com essa declaração, o Lombok geraria os métodos getName(), setName(), getAge(), setAge(), toString(), equals()
e hashCode() automaticamente na classe Person. Isso ajuda a tornar o código mais limpo e conciso, especialmente
em classes que têm muitos campos.*/
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Data
@ToString
@RequiredArgsConstructor
@Builder
public class UserDto {
    private String id;
    private String name;
    private String username;
    private Stirng email;
    private String password;
/*The final modifier indicates that the attribute value is defined only once, that is, after initialization at
some point in the code (through the constructor or in the attribute declaration itself), it cannot be changed
again. Once assigned, its value becomes constant.*/

    private final String id;
    private final String name;
    private final String username;
    private final Stirng email;
    private final String password;

    public Dto (User user) {
        id = user.getId();
        name = user.getName();
        username = user.getUsername();
        email = user.getEmail();
        password = user.getPassword();
    }
}
