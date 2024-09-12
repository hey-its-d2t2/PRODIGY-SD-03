package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

        //Find by name
        @Query("SELECT c FROM Contact c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))")
        List<Contact> findByNameContainingIgnoreCase(@Param("name") String name);

        //Find by nickname
        @Query("SELECT c FROM Contact c WHERE LOWER(c.nickname) LIKE LOWER(CONCAT('%', :nickname, '%'))")
         List<Contact> findByNicknameContainingIgnoreCase(@Param("nickname") String nickname);

        // Find by Email Address (Partial and Case-Insensitive)
        @Query("SELECT c FROM Contact c WHERE LOWER(c.email) LIKE LOWER(CONCAT('%', :email, '%'))")
        List<Contact> findContactByEmailContainingIgnoreCase(@Param("email") String email);

        // Find by Phone Number
        @Query("SELECT c FROM Contact c WHERE LOWER(c.number) LIKE LOWER(CONCAT('%', :number, '%'))")
        List<Contact> findContactByNumberContaining(@Param("number") String number);

        //Find by address
        //List<Contact> findContactByAddressContainingIgnoreCase(String address);
        @Query("SELECT c FROM Contact c WHERE LOWER(c.address) LIKE LOWER(CONCAT('%', :address, '%'))")
        List<Contact> findContactByAddressContainingIgnoreCase(String address);

        //Find by birthday
        @Query("SELECT c FROM Contact c WHERE c.birthday = :birthday")
        List<Contact> findContactByBirthdayContaining(Date birthday);

        //Find by relationship
        @Query("SELECT c FROM Contact c WHERE LOWER(c.relationship) LIKE LOWER(CONCAT('%', :relationship, '%'))")
        List<Contact> findContactsByRelationshipContainingIgnoreCase(@Param("relationship") String relationship);
}