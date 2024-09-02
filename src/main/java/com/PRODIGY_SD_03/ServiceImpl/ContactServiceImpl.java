package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Repository.ContactRepository;
import com.PRODIGY_SD_03.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

   /* public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }*/

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
           contact.setPrimaryPhoneNumber(contactDetails.getPrimaryPhoneNumber());
           contact.setSecondaryPhoneNumber(contactDetails.getSecondaryPhoneNumber());
           contact.setPrimaryEmailAddress(contactDetails.getPrimaryEmailAddress());
           contact.setSecondaryEmailAddress(contactDetails.getSecondaryEmailAddress());
           contact.setAddress(contactDetails.getAddress());
           contact.setCompany(contact.getCompany());
           contact.setJobTitle(contactDetails.getJobTitle());
           contact.setNotes(contactDetails.getNotes());
           contact.setPhotoUrl(contactDetails.getPhotoUrl());
           contact.setWebsite(contactDetails.getWebsite());
           contact.setBirthday(contactDetails.getBirthday());
           contact.setNickname(contactDetails.getNickname());
           contact.setRelationship(contact.getRelationship());
           contact.setLabel(contactDetails.getLabel());
           contact.setDepartment(contactDetails.getDepartment());
           contact.setOfficeLocation(contactDetails.getOfficeLocation());
           contact.setLanguage(contactDetails.getLanguage());
           return contactRepository.save(contact);
       }else{
            throw  new RuntimeException("Contact not found with id: " +id);
       }
    }


}
