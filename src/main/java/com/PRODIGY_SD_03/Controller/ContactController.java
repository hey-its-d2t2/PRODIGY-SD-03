package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/getAllContacts")
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> newContacts = contactService.getAllContact();
        return new ResponseEntity<>(newContacts, HttpStatus.OK);
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
            @RequestBody Contact contactDetails) {
        return contactService.getContactById(id)
                .map(contact -> {
                    contact.setName(contactDetails.getName());
                    contact.setEmail(contactDetails.getEmail());
                    contact.setNumber(contactDetails.getNumber());
                    contact.setAddress(contactDetails.getAddress());
                    contact.setPhotoUrl(contactDetails.getPhotoUrl());
                    contact.setBirthday(contactDetails.getBirthday());
                    contact.setNickname(contactDetails.getNickname());
                    contact.setRelationship(contactDetails.getRelationship());

                    Contact updatedContact = contactService.addContact(contact);
                    return new ResponseEntity<>(updatedContact, HttpStatus.OK);
                }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @DeleteMapping("/deleteContact/{id}")
    public ResponseEntity<HttpStatus> deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
