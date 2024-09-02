package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.FindByName;

import java.util.List;

public class FindByNameImpl implements FindByName {
    @Override
    public List<Contact> findContactByFirstName(String name) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByMiddleName(String name) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByLastName(String name) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByNickName(String nickname) {
        return List.of();
    }
}
