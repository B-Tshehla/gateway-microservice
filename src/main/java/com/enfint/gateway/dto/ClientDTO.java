package com.enfint.gateway.dto;

import com.enfint.gateway.util.Gender;
import com.enfint.gateway.util.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String email;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Integer dependentNumber;
    private Passport passport;
    private EmploymentDTO employment;
    private String account;

}
