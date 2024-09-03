package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.FindByEmailNumber;
import com.PRODIGY_SD_03.ServiceImpl.FindByEmailNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contacts/email-number")
public class FindByEmailNumberController {

    @Autowired
    private FindByEmailNumber findByEmailNumber;

    @GetMapping("/find-by-pri-email/{priEmail}")
    public ResponseEntity<List<Contact>> findContactByPriEmail(@PathVariable("priEmail") String priEmail) {
        List<Contact> contacts = findByEmailNumber.findContactByEmail(priEmail);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/find-by-sec-email/{secEmail}")
    public ResponseEntity<List<Contact>> findContactBySecEmail(@PathVariable("secEmail") String secEmail) {
        List<Contact> contacts = findByEmailNumber.findContactBySecEmail(secEmail);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/find-by-pri-number/{priNumber}")
    public ResponseEntity<List<Contact>> findContactByPrimaryPhone(@PathVariable("priNumber") String priNumber) {
        List<Contact> contacts = findByEmailNumber.findContactByPrimaryPhone(priNumber);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
    @GetMapping("/find-by-sec-number/{secNumber}")
    public ResponseEntity<List<Contact>> findContactBySecPhone(@PathVariable("secNumber") String secNumber) {
        List<Contact> contacts = findByEmailNumber.findContactBySecondaryPhone(secNumber);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }


}
