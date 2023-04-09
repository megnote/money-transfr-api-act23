package com.act.moneytransferapi.domains;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Entity(name = "account")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @Column(nullable = false)
    @Size(max = 15, min = 3)
    @NotBlank(message = "first name can not be empty")
    private String firstname;

    @Column(nullable = false)
    @Size(max = 15)
    @NotBlank(message = "last name can not be empty")
    private String middlename;

    @Column(nullable = false)
    @Size(max = 15)
    @NotBlank(message = "last name can not be empty")
    private String lastname;

    @Column(nullable = false,unique = true)
    @NotBlank(message = "email can not be null")
    private String email;

    @Column(nullable = false,unique = true)
    @NotBlank(message = "phonenumber can not be null")
    private String phonenumber;

    @Column(nullable = false)
    @NotNull(message = "date of birth can not be empty")
    private LocalDate dateofbirth;

    @Column(nullable = false)
    @NotNull(message = "pin must be set")
    @Max(6)
    @Min(4)
    private  Integer pin;

    @Column(nullable = false)
    private Double balance = 0.0;

    @Column(nullable = false)
    private LocalDate openingDate = LocalDate.now();

}
