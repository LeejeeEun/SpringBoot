package com.codepresso.controllerexcercise.controller;

import com.codepresso.controllerexcercise.dto.SpecialtyDto;
import com.codepresso.controllerexcercise.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/user")
    public UserDto getUser() {
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java","Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot","Basic"));

        return new UserDto(1, "Jin", "Kos656@naver.com", specialties);
    }
}
