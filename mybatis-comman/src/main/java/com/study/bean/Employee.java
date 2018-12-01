package com.study.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Employee {
    private Long id;
    private String lastName;
    private String gender;
    private String email;

}
