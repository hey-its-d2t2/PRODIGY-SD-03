package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Repository.ContactRepository;
import com.PRODIGY_SD_03.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;


    @Override
    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    @Override
    public List<Contact> getAllContact() {
        return contactRepository.findAll();
    }

    @Override
    public Contact updateContact(Long id, Contact contactDetails) {
       Optional<Contact> optContact = contactRepository.findById(id);

       if(optContact.isPresent()){
           Contact contact = optContact.get();

           contact.setName(contactDetails.getName());
           contact.setNumber(contactDetails.getNumber());
           contact.setEmail(contactDetails.getEmail());
           contact.setAddress(contactDetails.getAddress());
           contact.setPhotoUrl(contactDetails.getPhotoUrl());
           contact.setBirthday(contactDetails.getBirthday());
           contact.setNickname(contactDetails.getNickname());
           contact.setRelationship(contactDetails.getRelationship());
           return contactRepository.save(contact);
       }else{
            throw  new RuntimeException("Contact not found with id: " +id);
       }
    }

    @Override
    public void deleteContact(Long id) {
            contactRepository.deleteById(id);
    }


    // Search

    @Override
    public List<Contact> findContactByName(String firstName) {
        return contactRepository.findByNameContainingIgnoreCase(firstName);
    }

    @Override
    public List<Contact> findContactByNickname(String nickname) {
        return contactRepository.findByNicknameContainingIgnoreCase(nickname);
    }

    @Override
    public List<Contact> findContactByEmail(String email) {
        return contactRepository.findContactByEmailContainingIgnoreCase(email);
    }

    @Override
    public List<Contact> findContactByNumber(String number) {
        return contactRepository.findContactByNumberContaining(number);
    }


    @Override
    public List<Contact> findContactByBirthday(String birthday) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date sqlDate = new java.sql.Date(format.parse(birthday).getTime());
            return contactRepository.findContactByBirthdayContaining(sqlDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Contact> findContactsByRelationship(String relationship) {
        return contactRepository.findContactsByRelationshipContainingIgnoreCase(relationship);
    }

    @Override
    public List<Contact> findContactByAddress(String address) {
        return contactRepository.findContactByAddressContainingIgnoreCase(address);
    }
}
