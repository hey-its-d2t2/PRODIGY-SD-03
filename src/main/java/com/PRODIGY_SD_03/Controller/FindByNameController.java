package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.FindByName;
import com.PRODIGY_SD_03.ServiceImpl.FindByNameImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contacts/name")
public class FindByNameController {

    @Autowired
    FindByName findByName;

    @GetMapping("/findByFirstName/{firstName}")
    public ResponseEntity<List<Contact>> findContactsByFirstName(@PathVariable("firstName") String firstName) {
        List<Contact> contacts = findByName.findContactByFirstName(firstName);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/findByMiddleName/{middleName}")
    public ResponseEntity<List<Contact>> findContactsByMiddleName(@PathVariable("middleName") String middleName) {
        List<Contact> contacts = findByName.findContactByMiddleName(middleName);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/findByLastName/{lastName}")
    public ResponseEntity<List<Contact>> findContactsByLastName(@PathVariable("lastName") String lastName) {
        List<Contact> contacts = findByName.findContactByLastName(lastName);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/findByNickname/{nickname}")
    public ResponseEntity<List<Contact>> findContactsByNickname(@PathVariable("nickname") String nickname) {
        List<Contact> contacts = findByName.findContactByNickName(nickname);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}
