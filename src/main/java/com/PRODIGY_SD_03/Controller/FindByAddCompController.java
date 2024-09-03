package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.FindByAddComp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("api/contacts/address")
public class FindByAddCompController {

    @Autowired
    private FindByAddComp findByAddComp;

    @GetMapping("addr/{addr}")
    public ResponseEntity<List<Contact>> findContactByAddress(@PathVariable("addr") String addr) {
        List<Contact> contacts = findByAddComp.findContactByAddress(addr);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("company/{comp}")
    public ResponseEntity<List<Contact>> findContactsByCompany(@PathVariable("comp") String comp) {
        List<Contact> contacts = findByAddComp.findContactsByCompany(comp);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("jobTitle/{job}")
    public ResponseEntity<List<Contact>> findContactsByJobTitle(@PathVariable("job") String job) {
        List<Contact> contacts = findByAddComp.findContactsByJobTitle(job);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("label/{lbl}")
    public ResponseEntity<List<Contact>> findContactsByJobLabel(@PathVariable("lbl") String lbl) {
        List<Contact> contacts = findByAddComp.findContactsByLabel(lbl);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("department/{dept}")
    public ResponseEntity<List<Contact>> findContactsByDepartment(@PathVariable("dept") String dept) {
        List<Contact> contacts = findByAddComp.findContactsByDepartment(dept);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("office-location/{ofloc}")
    public ResponseEntity<List<Contact>> findContactsByOfficeLocation(@PathVariable("ofloc") String ofloc) {
        List<Contact> contacts = findByAddComp.findContactsByOfficeLocation(ofloc);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("language/{lan}")
    public ResponseEntity<List<Contact>> findContactsByLanguage(@PathVariable("lan") String lan) {
        List<Contact> contacts = findByAddComp.findContactsByLanguage(lan);
        if (contacts == null || contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

}
