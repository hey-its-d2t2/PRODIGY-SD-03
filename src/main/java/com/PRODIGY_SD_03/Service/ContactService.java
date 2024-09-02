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

    List<Contact> findContactByName(String name);
    List<Contact> findContactByNickName(String nickname);

    List<Contact> findContactByBirthday(String birthday);

    List<Contact> findContactByEmail(String email);
    List<Contact> findContactBySecEmail(String secEmail);

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
