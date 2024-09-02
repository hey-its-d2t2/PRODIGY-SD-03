package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Repository.FindByDateRelationRepository;
import com.PRODIGY_SD_03.Service.FindByDateRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class FindByDateRelationImpl implements FindByDateRelation {

    @Autowired
    private FindByDateRelationRepository repository;

    @Override
    public List<Contact> findContactByBirthday(String birthday) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date sqlDate = new java.sql.Date(format.parse(birthday).getTime());
            return repository.findContactByBirthday(Date.valueOf(String.valueOf(sqlDate)));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Contact> findContactsByRelationship(String relationship) {
        return repository.findContactsByRelationship(relationship);
    }
}
