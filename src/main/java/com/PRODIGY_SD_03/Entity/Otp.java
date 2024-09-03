package com.PRODIGY_SD_03.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "otp")
public class Otp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String otpCode;
    private LocalDateTime expiryDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
