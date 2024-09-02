package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;

import java.util.List;

public interface FindByName {
    //find by Name
    List<Contact> findContactByFirstName(String name);
    List<Contact> findContactByMiddleName(String name);
    List<Contact> findContactByLastName(String name);
    List<Contact> findContactByNickName(String nickname);
}
