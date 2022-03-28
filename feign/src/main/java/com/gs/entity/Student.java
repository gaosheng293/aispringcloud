package com.gs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private long id;

    public Student() {
    }

    private String name;
    private int age;
}
