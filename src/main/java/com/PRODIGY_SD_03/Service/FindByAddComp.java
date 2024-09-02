package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;

import java.util.List;

public interface FindByAddComp {
    //Find By address
    List<Contact> findContactByAddress(String address);

    List<Contact> findContactsByCompany(String company);

    List<Contact> findContactsByJobTitle(String jobTitle);

    List<Contact> findContactsByLabel(String label);

    List<Contact> findContactsByDepartment(String department);

    List<Contact> findContactsByOfficeLocation(String officeLocation);

    List<Contact> findContactsByLanguage(String language);
}
