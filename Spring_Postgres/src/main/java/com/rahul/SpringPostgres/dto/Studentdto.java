package com.rahul.SpringPostgres.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Studentdto {
    private Long id;
    private String name;
    private int marks;
}
