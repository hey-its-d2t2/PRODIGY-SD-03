package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.FindByDateRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contacts/date-relation")
public class FindByDateRelationController {
    @Autowired
    private FindByDateRelation dateRelation;

    @GetMapping("/birthday/{date}")
    public ResponseEntity<List<Contact>> findContactByBirthday(@PathVariable("date") String date) {
        List<Contact> contacts = dateRelation.findContactByBirthday(date);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/relationship/{relation}")
    public ResponseEntity<List<Contact>> findContactsByRelationship(@PathVariable("relation") String relation) {
        List<Contact> contacts = dateRelation.findContactsByRelationship(relation);
        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}
