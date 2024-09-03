package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FindByEmailNumberRepository extends JpaRepository<Contact, Long> {


    // Find by Primary Email Address (Partial and Case-Insensitive)
    @Query("SELECT c FROM Contact c WHERE LOWER(c.primaryEmailAddress) LIKE LOWER(CONCAT('%', :email, '%'))")
    List<Contact> findContactByEmailContainingIgnoreCase(@Param("email") String email);

    // Find by Secondary Email Address (Partial and Case-Insensitive)
    @Query("SELECT c FROM Contact c WHERE LOWER(c.secondaryEmailAddress) LIKE LOWER(CONCAT('%', :secEmail, '%'))")
    List<Contact> findContactBySecEmailContainingIgnoreCase(@Param("secEmail") String secEmail);

    // Find by Primary Phone Number (Partial and Case-Insensitive)
    @Query("SELECT c FROM Contact c WHERE LOWER(c.primaryPhoneNumber) LIKE LOWER(CONCAT('%', :priNumber, '%'))")
    List<Contact> findContactByPrimaryPhoneContainingIgnoreCase(@Param("priNumber") String priNumber);

    // Find by Secondary Phone Number (Partial and Case-Insensitive)
    @Query("SELECT c FROM Contact c WHERE LOWER(c.secondaryPhoneNumber) LIKE LOWER(CONCAT('%', :secNumber, '%'))")
    List<Contact> findContactBySecondaryPhoneContainingIgnoreCase(@Param("secNumber") String secNumber);


  /*  @Query("SELECT c FROM Contact c WHERE c.primaryEmailAddress = :email")
    List<Contact> findContactByEmail(String email);

    @Query("SELECT c FROM Contact c WHERE c.secondaryEmailAddress = :secEmail")
    List<Contact> findContactBySecEmail(String secEmail);

    //Find by Phone Number

    @Query("SELECT c FROM Contact c WHERE c.primaryPhoneNumber = :priNumber")
    List<Contact> findContactByPrimaryPhone(String priNumber);

*//*    @Query("SELECT c FROM Contact c WHERE c.secondaryPhoneNumber = :secNumber")
    List<Contact> findContactBySecondaryPhone(String secNumber);*//*

    @Query("SELECT c FROM Contact c WHERE c.secondaryPhoneNumber = :secNumber")
    List<Contact> findContactBySecondaryPhone(@Param("secNumber") String secNumber);*/

}
