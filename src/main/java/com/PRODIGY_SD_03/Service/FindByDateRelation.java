package com.PRODIGY_SD_03.Service;

import com.PRODIGY_SD_03.Entity.Contact;

import java.util.List;

public interface FindByDateRelation {
    //Find by Birth Date
    List<Contact> findContactByBirthday(String birthday);
    List<Contact> findContactsByRelationship(String relationship);
}
