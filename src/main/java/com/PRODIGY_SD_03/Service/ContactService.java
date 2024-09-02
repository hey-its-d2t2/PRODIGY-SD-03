package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    Contact addContact(Contact contact);

    Optional<Contact> getContactById(Long id);

    List<Contact> getAllContact();

    Contact updateContact(Long id, Contact contactDetails);

    void deleteContact(Long id);

    //find by Name
    List<Contact> findContactByFirstName(String name);
    List<Contact> findContactByMiddleName(String name);
    List<Contact> findContactByLastName(String name);
    List<Contact> findContactByNickName(String nickname);

    //Find by Birth Date
    List<Contact> findContactByBirthday(String birthday);

    //Find by Email
    List<Contact> findContactByEmail(String email);
    List<Contact> findContactBySecEmail(String secEmail);

    //Find by Phone Number
    List<Contact> findContactByPrimaryPhone(String priNumber);
    List<Contact> findContactBySecondaryPhone(String secNumber);


    List<Contact> findContactsByCompany(String company);

    List<Contact> findContactsByJobTitle(String jobTitle);

    List<Contact> findContactsByLabel(String label);

    List<Contact> findContactsByRelationship(String relationship);

    List<Contact> findContactsByDepartment(String department);

    List<Contact> findContactsByOfficeLocation(String officeLocation);

    List<Contact> findContactsByLanguage(String language);

}
