package com.PRODIGY_SD_03.Controller;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("api")
public class ViewController {
    @Autowired
    ContactService contactService;

    @GetMapping("/cont")
    public String viewContacts(Model model) {
        List<Contact> contacts = contactService.getAllContact();
        model.addAttribute("contacts", contacts);
        return "contact";
    }
}
