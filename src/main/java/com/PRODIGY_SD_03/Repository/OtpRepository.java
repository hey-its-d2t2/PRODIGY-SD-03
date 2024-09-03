package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Otp;
import com.PRODIGY_SD_03.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpRepository extends JpaRepository<Otp, Long> {
    Optional<Otp> findByUserAndOtpCode(User user, String otpCode);
}