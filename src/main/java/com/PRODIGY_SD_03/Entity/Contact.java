package com.PRODIGY_SD_03.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(max = 30, min = 3, message = "Name must be between 3 and 100 characters.")
    private String name;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String number;


    @NotBlank(message = "Email address is required")
    @Email(message = "Email should be valid")
    @Size(max = 50, message = "Email cannot exceed 100 characters")
    private String email;

    @Size(max = 50, message = "Address cannot exceed 255 characters")
    private String address;

    private String photoUrl; // Optional photo field

    @Temporal(TemporalType.DATE)
    private Date birthday; // Optional birthday field

    @Column(name = "nickname")
    @Size(max = 25, message = "Nickname cannot exceed 255 characters")
    private String nickname; // Optional nickname

    @Size(max = 25, message = "Relationship cannot exceed 50 characters")
    private String relationship; // Optional relationship field (e.g., friend, family)



}