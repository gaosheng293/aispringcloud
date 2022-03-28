package com.gs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    public Student() {
    }

    private long id;
    private String name;
    private int age;
}
