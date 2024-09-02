package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByFirstName(String firstName);
    List<Contact> findByMiddleName(String middleName);
    List<Contact> findByLastName(String lastName);

    @Query("SELECT c FROM Contact c WHERE c.nickname = :nickname")
    List<Contact> findBynickname(String nickname);
}
