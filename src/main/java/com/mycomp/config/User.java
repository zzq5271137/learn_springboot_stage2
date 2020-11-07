package com.mycomp.config;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String name;
    private Integer age;
    private Integer[] scores;
    private List<String> skills;
}
