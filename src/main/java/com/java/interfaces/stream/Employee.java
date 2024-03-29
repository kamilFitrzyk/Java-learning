package com.java.interfaces.stream;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    int age;

    private List<String> skills;
}
