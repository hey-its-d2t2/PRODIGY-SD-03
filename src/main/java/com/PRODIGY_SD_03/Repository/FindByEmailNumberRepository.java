package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FindByEmailNumberRepository extends JpaRepository<Contact, Long> {

    @Query("SELECT c FROM Contact c WHERE c.primaryEmailAddress = :email")
    List<Contact> findContactByEmail(String email);

    @Query("SELECT c FROM Contact c WHERE c.secondaryEmailAddress = :secEmail")
    List<Contact> findContactBySecEmail(String secEmail);

    //Find by Phone Number

    @Query("SELECT c FROM Contact c WHERE c.primaryPhoneNumber = :priNumber")
    List<Contact> findContactByPrimaryPhone(String priNumber);

    @Query("SELECT c FROM Contact c WHERE c.secondaryPhoneNumber = :secNumber")
    List<Contact> findContactBySecondaryPhone(String secNumber);
}
