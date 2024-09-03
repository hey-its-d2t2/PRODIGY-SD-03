package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByFirstNameContainingIgnoreCase(String firstName);
    List<Contact> findByMiddleNameContainingIgnoreCase(String middleName);
    List<Contact> findByLastNameContainingIgnoreCase(String lastName);

  /*  @Query("SELECT c FROM Contact c WHERE c.nickname = :nickname")
    List<Contact> findByNicknameContainingIgnoreCase(String nickname);*/

  @Query("SELECT c FROM Contact c WHERE LOWER(c.nickname) LIKE LOWER(CONCAT('%', :nickname, '%'))")
  List<Contact> findByNicknameContainingIgnoreCase(@Param("nickname") String nickname);

}
