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

           contact.setFirstName(contactDetails.getFirstName());
           contact.setMiddleName(contactDetails.getMiddleName());
           contact.setLastName(contactDetails.getLastName());
           contact.setPrimaryPhoneNumber(contactDetails.getPrimaryPhoneNumber());
           contact.setSecondaryPhoneNumber(contactDetails.getSecondaryPhoneNumber());
           contact.setPrimaryEmailAddress(contactDetails.getPrimaryEmailAddress());
           contact.setSecondaryEmailAddress(contactDetails.getSecondaryEmailAddress());
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
           return contactRepository.save(contact);
       }else{
            throw  new RuntimeException("Contact not found with id: " +id);
       }
    }

    @Override
    public void deleteContact(Long id) {
            contactRepository.deleteById(id);
    }

    //-------
    @Override
    public List<Contact> findContactByFirstName(String name) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByMiddleName(String name) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByLastName(String name) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByNickName(String nickname) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByBirthday(String birthday) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByEmail(String email) {
        return List.of();
    }

    @Override
    public List<Contact> findContactBySecEmail(String secEmail) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByPrimaryPhone(String priNumber) {
        return List.of();
    }

    @Override
    public List<Contact> findContactBySecondaryPhone(String secNumber) {
        return List.of();
    }

    @Override
    public List<Contact> findContactByAddress(String address) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByCompany(String company) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByJobTitle(String jobTitle) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByLabel(String label) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByRelationship(String relationship) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByDepartment(String department) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByOfficeLocation(String officeLocation) {
        return List.of();
    }

    @Override
    public List<Contact> findContactsByLanguage(String language) {
        return List.of();
    }

    //----
   /* @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    @Override
    public List<Contact> searchContactsByName(String name) {
        return contactRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Contact> findContactsByCompany(String company) {
        return contactRepository.findByCompanyContainingIgnoreCase(company);
    }

    @Override
    public List<Contact> findContactsByJobTitle(String jobTitle) {
        return contactRepository.findByJobTitleContainingIgnoreCase(jobTitle);
    }

    @Override
    public List<Contact> findContactsByLabel(String label) {
        return contactRepository.findByLabelContainingIgnoreCase(label);
    }

    @Override
    public List<Contact> findContactsByRelationship(String relationship) {
        return contactRepository.findByRelationshipContainingIgnoreCase(relationship);
    }

    @Override
    public List<Contact> findContactsByDepartment(String department) {
        return contactRepository.findByDepartmentContainingIgnoreCase(department);
    }

    @Override
    public List<Contact> findContactsByOfficeLocation(String officeLocation) {
        return contactRepository.findByOfficeLocationContainingIgnoreCase(officeLocation);
    }

    @Override
    public List<Contact> findContactsByLanguage(String language) {
        return contactRepository.findByLanguageContainingIgnoreCase(language);
    }
*/
}
