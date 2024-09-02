package com.PRODIGY_SD_03.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;


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
    @Size(max = 100, min = 3, message = "Name must be between 3 and 100 characters.")
    private String firstName;

    @Size(max = 100, min = 3, message = "Middle Name must be between 3 and 100 characters.")
    private String middleName;

    @NotBlank(message = "Name is required")
    @Size(max = 100, min = 3, message = "Last Name must be between 3 and 100 characters.")
    private String lastName;

    @NotBlank(message = "Primary phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String primaryPhoneNumber;

    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String secondaryPhoneNumber; // Optional secondary phone number

    @NotBlank(message = "Primary email address is required")
    @Email(message = "Email should be valid")
    @Size(max = 100, message = "Email cannot exceed 100 characters")
    private String primaryEmailAddress;

    @Email(message = "Email should be valid")
    @Size(max = 100, message = "Email cannot exceed 100 characters")
    private String secondaryEmailAddress; // Optional secondary email address

    @Size(max = 255, message = "Address cannot exceed 255 characters")
    private String address;

    @Size(max = 100, message = "Company name cannot exceed 100 characters")
    private String company;

    @Size(max = 100, message = "Job title cannot exceed 100 characters")
    private String jobTitle;

    @Size(max = 500, message = "Notes cannot exceed 500 characters")
    private String notes;

    private String photoUrl; // Optional photo field

    @Size(max = 255, message = "Website URL cannot exceed 255 characters")
    private String website; // Optional website URL

    @Temporal(TemporalType.DATE)
    private Date birthday; // Optional birthday field

    @Column(name = "nickname")
    @Size(max = 255, message = "Nickname cannot exceed 255 characters")
    private String nickname; // Optional nickname

    @Size(max = 50, message = "Relationship cannot exceed 50 characters")
    private String relationship; // Optional relationship field (e.g., friend, family)

    @Size(max = 50, message = "Label cannot exceed 50 characters")
    private String label; // Optional custom label for the contact

    @Size(max = 100, message = "Department cannot exceed 100 characters")
    private String department; // Optional department within a company

    @Size(max = 100, message = "Office location cannot exceed 100 characters")
    private String officeLocation; // Optional office location

    @Size(max = 50, message = "Language cannot exceed 50 characters")
    private String language; // Optional language preference

}