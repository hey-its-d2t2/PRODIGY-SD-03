package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;

import java.util.List;

public interface FindByName {
    //find by Name
    List<Contact> findContactByFirstName(String firstName);
    List<Contact> findContactByMiddleName(String middleName);
    List<Contact> findContactByLastName(String lastName);
    List<Contact> findContactByNickName(String nickname);
}
