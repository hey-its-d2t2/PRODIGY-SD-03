package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;

import java.util.List;

public interface FindByEmailNumber {
    //Find by Email
    List<Contact> findContactByEmail(String email);
    List<Contact> findContactBySecEmail(String secEmail);

    //Find by Phone Number
    List<Contact> findContactByPrimaryPhone(String priNumber);
    List<Contact> findContactBySecondaryPhone(String secNumber);
}
