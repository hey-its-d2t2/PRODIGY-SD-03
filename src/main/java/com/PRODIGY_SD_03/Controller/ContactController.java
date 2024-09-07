package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/getAllContacts")
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContact();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @PostMapping("/addContact")
    public ResponseEntity<Contact> createContacts(@RequestBody Contact contact) {
        Contact newContact = contactService.addContact(contact);
        return new ResponseEntity<>(newContact, HttpStatus.OK);
    }

    @GetMapping("/getContactsById/{id}")
    public ResponseEntity<Contact> getContactsById(@PathVariable("id") Long id) {
        return contactService.getContactById(id)
                .map(contact -> new ResponseEntity<>(contact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/updateContact/{id}")
    public ResponseEntity<Contact> updateContact(
            @PathVariable("id") Long id,
            @RequestBody Contact contactDetails){
        return  contactService.getContactById(id)
                .map(contact -> {
                    contact.setFirstName(contactDetails.getFirstName());
                    contact.setMiddleName(contactDetails.getMiddleName());
                    contact.setLastName(contactDetails.getLastName());
                    contact.setPrimaryEmailAddress(contactDetails.getPrimaryEmailAddress());
                    contact.setSecondaryEmailAddress(contactDetails.getSecondaryEmailAddress ());
                    contact.setPrimaryPhoneNumber(contactDetails.getPrimaryPhoneNumber());
                    contact.setSecondaryPhoneNumber(contactDetails.getSecondaryPhoneNumber());
                    contact.setAddress(contactDetails.getAddress());
                    contact.setCompany(contactDetails.getCompany());
                    contact.setJobTitle(contactDetails.getJobTitle());
                    contact.setNotes(contactDetails.getNotes());
                    contact.setPhotoUrl(contactDetails.getPhotoUrl());
                    contact.setWebsite(contactDetails.getWebsite());
                    contact.setBirthday(contactDetails.getBirthday());
                    contact.setNickname(contactDetails.getNickname());
                    contact.setRelationship(contactDetails.getRelationship());
                    contact.setLabel(contactDetails.getLabel());
                    contact.setDepartment(contactDetails.getDepartment());
                    contact.setOfficeLocation(contactDetails.getOfficeLocation());
                    contact.setLanguage(contactDetails.getLanguage());
                    Contact updateContact = contactService.addContact(contact);
                    return new ResponseEntity<>(updateContact, HttpStatus.OK);
                }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteContact/{id}")
    public ResponseEntity<HttpStatus> deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
