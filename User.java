package com.onboarding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onboarding.crud.api.dto.UserInsertDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "table_user")
@Data

private String id
private String name;
private String username;
private Stirng email;
private String password;

public class User{

    private String id
    private String name;
    private String username;
    private Stirng email;
    private String password;

    public User(){
        this.id = "";
        this.name = "";
        this.username = "";
        this.email = "";
        this.password = "";
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Stirng getEmail() {
        return email;
    }

    public void setEmail(Stirng email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
