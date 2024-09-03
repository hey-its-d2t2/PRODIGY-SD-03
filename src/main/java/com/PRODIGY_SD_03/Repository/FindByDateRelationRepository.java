package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface FindByDateRelationRepository extends JpaRepository<Contact, Long>  {

    @Query("SELECT c FROM Contact c WHERE c.birthday = :birthday")
    List<Contact> findContactByBirthdayContaining(Date birthday);

    @Query("SELECT c FROM Contact c WHERE LOWER(c.relationship) LIKE LOWER(CONCAT('%', :relationship, '%'))")
    List<Contact> findContactsByRelationshipContainingIgnoreCase(@Param("relationship") String relationship);
}
