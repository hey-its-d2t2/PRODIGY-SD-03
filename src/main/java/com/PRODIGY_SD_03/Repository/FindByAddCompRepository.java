package com.PRODIGY_SD_03.Repository;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @Repository
    public interface FindByAddCompRepository extends JpaRepository<Contact, Long> {

        /*
        List<Contact> findContactByAddressContaining(String address);

        List<Contact> findContactsByCompanyContaining(String company);

        List<Contact> findContactsByJobTitleContaining(String jobTitle);

        List<Contact> findContactsByLabelContaining(String label);

        List<Contact> findContactsByDepartmentContaining(String department);

        List<Contact> findContactsByOfficeLocationContaining(String officeLocation);

        List<Contact> findContactsByLanguageContaining(String language)
        */;

        List<Contact> findContactByAddressContainingIgnoreCase(String address);

        List<Contact> findContactsByCompanyContainingIgnoreCase(String company);

        List<Contact> findContactsByJobTitleContainingIgnoreCase(String jobTitle);

        List<Contact> findContactsByLabelContainingIgnoreCase(String label);

        List<Contact> findContactsByDepartmentContainingIgnoreCase(String department);

        List<Contact> findContactsByOfficeLocationContainingIgnoreCase(String officeLocation);

        List<Contact> findContactsByLanguageContainingIgnoreCase(String language);

        /*
        @Query("SELECT c FROM Contact c WHERE LOWER(c.address) LIKE LOWER(CONCAT('%', :address, '%'))")
        List<Contact> findContactByAddressContaining(String address);

        @Query("SELECT c FROM Contact c WHERE LOWER(c.company) LIKE LOWER(CONCAT('%', :company, '%'))")
        List<Contact> findContactsByCompanyContaining(String company);

        @Query("SELECT c FROM Contact c WHERE LOWER(c.jobTitle) LIKE LOWER(CONCAT('%', :jobTitle, '%'))")
        List<Contact> findContactsByJobTitleContaining(String jobTitle);

        @Query("SELECT c FROM Contact c WHERE LOWER(c.label) LIKE LOWER(CONCAT('%', :label, '%'))")
        List<Contact> findContactsByLabelContaining(String label);

        @Query("SELECT c FROM Contact c WHERE LOWER(c.department) LIKE LOWER(CONCAT('%', :department, '%'))")
        List<Contact> findContactsByDepartmentContaining(String department);

        @Query("SELECT c FROM Contact c WHERE LOWER(c.officeLocation) LIKE LOWER(CONCAT('%', :officeLocation, '%'))")
        List<Contact> findContactsByOfficeLocationContaining(String officeLocation);

        @Query("SELECT c FROM Contact c WHERE LOWER(c.language) LIKE LOWER(CONCAT('%', :language, '%'))")
        List<Contact> findContactsByLanguageContaining(String language);
        */
    }
