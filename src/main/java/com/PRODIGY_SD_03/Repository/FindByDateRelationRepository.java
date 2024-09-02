package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface FindByDateRelationRepository extends JpaRepository<Contact, Long>  {

    @Query("SELECT c FROM Contact c WHERE c.birthday = :birthday")
    List<Contact> findContactByBirthday(Date birthday);

    @Query("SELECT c FROM Contact c WHERE c.relationship = :relationship")
    List<Contact> findContactsByRelationship(String relationship);
}
