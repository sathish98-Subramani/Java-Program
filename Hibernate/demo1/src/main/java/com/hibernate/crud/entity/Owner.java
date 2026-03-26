package com.hibernate.crud.entity;

import com.hibernate.crud.enums.Gender;
import com.hibernate.crud.enums.PetType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="owner_table")
public class Owner {
    @Id
    private int id;

    @Column(name="first_name",nullable = false)
    private String firstName;

    @Column(name="last_name",nullable = false)
    private String lastName;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(name="mobile_number",nullable = false,unique = true,length = 10)
    private String mobileNumber;

    @Column(name="email_id",nullable = false,unique = true)
    private String emailId;

    @Column(name="pet_id",nullable = false)
    private int petId;

    @Column(name="pet_name",nullable = false)
    private String petName;

    @Column(name="pet_date_of_birth",nullable = false)
    private LocalDate petBirthDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name="pet_gender",nullable = false)
    private Gender petGender;

    @Column(name="pet_Type",nullable = false)
    private PetType petType;
}