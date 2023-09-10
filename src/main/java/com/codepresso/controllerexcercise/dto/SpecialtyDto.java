package com.codepresso.controllerexcercise.dto;

public class SpecialtyDto {
    String name;
    String level;

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public SpecialtyDto(String name, String level) {
        this.name = name;
        this.level = level;
    }
}
