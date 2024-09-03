package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface FindByAddCompRepository extends JpaRepository<Contact, Long> {

    List<Contact> findContactByAddress(String address);

    List<Contact> findContactsByCompany(String company);

    List<Contact> findContactsByJobTitle(String jobTitle);

    List<Contact> findContactsByLabel(String label);

    List<Contact> findContactsByDepartment(String department);

    List<Contact> findContactsByOfficeLocation(String officeLocation);

    List<Contact> findContactsByLanguage(String language);
}
