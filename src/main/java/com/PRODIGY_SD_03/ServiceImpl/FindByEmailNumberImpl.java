package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Repository.FindByEmailNumberRepository;
import com.PRODIGY_SD_03.Service.FindByEmailNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindByEmailNumberImpl implements FindByEmailNumber {

    @Autowired
    FindByEmailNumberRepository service;

    @Override
    public List<Contact> findContactByEmail(String email) {
        return service.findContactByEmailContainingIgnoreCase(email);
    }

    @Override
    public List<Contact> findContactBySecEmail(String secEmail) {
        return service.findContactBySecEmailContainingIgnoreCase(secEmail);
    }

    @Override
    public List<Contact> findContactByPrimaryPhone(String priNumber) {
        return service.findContactByPrimaryPhoneContainingIgnoreCase(priNumber);
    }

    @Override
    public List<Contact> findContactBySecondaryPhone(String secNumber) {
        return service.findContactBySecondaryPhoneContainingIgnoreCase(secNumber);
    }
}
