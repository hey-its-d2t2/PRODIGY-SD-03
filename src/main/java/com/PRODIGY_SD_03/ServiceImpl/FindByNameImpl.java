package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Repository.NameRepository;
import com.PRODIGY_SD_03.Service.FindByName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindByNameImpl implements FindByName {
    @Autowired
    private NameRepository  nameRepository;

    @Override
    public List<Contact> findContactByFirstName(String firstName) {
        return nameRepository.findByFirstNameContainingIgnoreCase(firstName);
    }

    @Override
    public List<Contact> findContactByMiddleName(String middleName) {
        return nameRepository.findByMiddleNameContainingIgnoreCase(middleName);
    }

    @Override
    public List<Contact> findContactByLastName(String lastName) {
        return nameRepository.findByLastNameContainingIgnoreCase(lastName);
    }

   @Override
    public List<Contact> findContactByNickName(String nickname) {
        return nameRepository.findByNicknameContainingIgnoreCase(nickname);
    }
}
