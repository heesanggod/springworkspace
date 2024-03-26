package com.heesang.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    private String name;
    private Integer age;   // NULL 값을 넣을려고
    private String address;
    private Boolean graduation;
}
