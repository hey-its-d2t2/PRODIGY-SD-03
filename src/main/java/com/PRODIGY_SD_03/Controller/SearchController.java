package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contacts/search/")
public class SearchController {


    @Autowired
    private ContactService contactService;

    @GetMapping("/findByName/{name}")
    public ResponseEntity<List<Contact>> findContactsByFirstName(@PathVariable("name") String name) {
        List<Contact> contacts = contactService.findContactByName(name);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/findByNickname/{nickname}")
    public ResponseEntity<List<Contact>> findContactsByNickname(@PathVariable("nickname") String nickname) {
        List<Contact> contacts = contactService.findContactByNickname(nickname);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }


    @GetMapping("/findByEmail/{email}")
    public ResponseEntity<List<Contact>> findContactByPriEmail(@PathVariable("email") String email) {
        List<Contact> contacts = contactService.findContactByEmail(email);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/findByNumber/{number}")
    public ResponseEntity<List<Contact>> findContactByPhoneNumber(@PathVariable("number") String number) {
        List<Contact> contacts = contactService.findContactByNumber(number);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/birthday/{date}")
    public ResponseEntity<List<Contact>> findContactByBirthday(@PathVariable("date") String date) {
        List<Contact> contacts = contactService.findContactByBirthday(date);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/relationship/{relation}")
    public ResponseEntity<List<Contact>> findContactsByRelationship(@PathVariable("relation") String relation) {
        List<Contact> contacts = contactService.findContactsByRelationship(relation);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("address/{addr}")
    public ResponseEntity<List<Contact>> findContactByAddress(@PathVariable("addr") String addr) {
        List<Contact> contacts = contactService.findContactByAddress(addr);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }


}
