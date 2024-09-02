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


}
