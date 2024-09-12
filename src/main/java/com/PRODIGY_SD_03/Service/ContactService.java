package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    Contact addContact(Contact contact);

    Optional<Contact> getContactById(Long id);

    List<Contact> getAllContact();

    Contact updateContact(Long id, Contact contactDetails);

    void deleteContact(Long id);

    //Search Methods

    List<Contact> findContactByName(String firstName);

    List<Contact> findContactByNickname(String nickname);

    List<Contact> findContactByAddress(String address);

    List<Contact> findContactByEmail(String email);

    List<Contact> findContactByNumber(String number);

    List<Contact> findContactByBirthday(String birthday);

    List<Contact> findContactsByRelationship(String relationship);
}
